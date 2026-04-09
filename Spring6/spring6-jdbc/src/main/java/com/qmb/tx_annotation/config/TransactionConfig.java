package com.qmb.tx_annotation.config;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TransactionConfig {
    // 1. 配置事务拦截器 (对应 <tx:advice>)
    @Bean
    public TransactionInterceptor txAdvice(DataSourceTransactionManager dataSourceTransactionManager) {

        // 对应 <tx:attributes>
        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();

        // 只读规则：对应 <tx:method name="get*" read-only="true"/>
        RuleBasedTransactionAttribute getAttr = new RuleBasedTransactionAttribute();
        getAttr.setReadOnly(true);

        // 更新/购买规则：对应 update* 和 buy* 的复杂配置
        RuleBasedTransactionAttribute updateAttr = new RuleBasedTransactionAttribute();
        updateAttr.setReadOnly(false);

        // 设置传播行为：REQUIRES_NEW
        updateAttr.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);

        // 设置回滚异常：rollback-for="java.lang.Exception"
        List<RollbackRuleAttribute> rollbackRules = new ArrayList<>();
        rollbackRules.add(new RollbackRuleAttribute(Exception.class));
        updateAttr.setRollbackRules(rollbackRules);

        // 绑定方法名到规则
        source.addTransactionalMethod("get*", getAttr);
        source.addTransactionalMethod("update*", updateAttr);
        source.addTransactionalMethod("buy*", updateAttr);
        source.addTransactionalMethod("check*", updateAttr);

        return new TransactionInterceptor(dataSourceTransactionManager, source);
    }

    // 3. 配置切入点和顾问 (对应 <aop:advisor>)
    @Bean
    public Advisor txAdvisor(TransactionInterceptor txAdvice) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        // 对应 execution(* com.qmb.tx_annotation..*.*(..))
        pointcut.setExpression("execution(* com.qmb.tx_annotation.service.*.*(..))");

        // 将拦截器（Advice）与切入点（Pointcut）组合成 Advisor
        return new DefaultPointcutAdvisor(pointcut, txAdvice);
    }
}

package com.qmb.aop.a2annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.parallel.Execution;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAspect {

    // 复用切入点表达式
    @Pointcut("execution( * com.qmb.aop..*.*(..))")
    public void pointCut(){}

    // 前置通知
    // 返回通知、异常通知
    // 后置通知
    // 环绕通知

    //通知
    @Before("pointCut()")
    public void beforeMethod(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名：" + methodName+"，参数："+args);
    }
    // 后置通知
    @After("pointCut()")
    public void afterMethod(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名：" + methodName);
    }
    // 返回通知
    @AfterReturning(value = "pointCut()",returning = "result")
    public void returningMethod(JoinPoint joinPoint,Object result)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名："+methodName+"，结果：" + result);
    }
    // 异常通知
    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void throwingMethod(JoinPoint joinPoint,Throwable ex)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名："+methodName+"，异常：" + ex);
    }
    // 环绕通知
    @Around(value = "pointCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            //目标对象（连接点）方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }

}

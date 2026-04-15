package com.qmb.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class MyCondition1 implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 需求2：导入注解属性值value指定坐标后常见bean
        // param1:context上下文对象。用于获取环境、IoC容器、ClassLoader对象
        // param2:metadata  当前被@Conditional判断的“目标对象”的注解元数据抽象
        // 获取注解属性值
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes("com.qmb.condition.ConditionOnClass");
        String[] value = (String[]) annotationAttributes.get("value");
        boolean flag = true;
        try {
            for (String s : value) {
                Class<?> clazz = Class.forName(s);
            }
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }
}

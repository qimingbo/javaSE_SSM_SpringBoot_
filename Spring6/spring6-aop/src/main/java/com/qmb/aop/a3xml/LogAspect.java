package com.qmb.aop.a3xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LogAspect {

    // 复用切入点表达式
    @Pointcut("execution( * com.qmb.aop..*.*(..))")
    public void pointCut(){}

    // 前置通知
    // 返回通知、异常通知
    // 后置通知
    // 环绕通知

    //通知
    public void beforeMethod(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名：" + methodName+"，参数："+args);
    }
    // 后置通知
    public void afterMethod(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名：" + methodName);
    }
    // 返回通知
    public void returningMethod(JoinPoint joinPoint,Object result)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名："+methodName+"，结果：" + result);
    }
    // 异常通知
    public void throwingMethod(JoinPoint joinPoint,Throwable ex)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名："+methodName+"，异常：" + ex);
    }
    // 环绕通知
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

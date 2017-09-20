package com.feng.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.xml.transform.Result;

/**
 * Created by Tomecs on 2017/9/20.
 */
//@Component
//@Aspect    //切面
public class StudentAop {

   /* @Pointcut(value = "execution(* com.feng.service.*.*(..))")
    public void pointCut() {

    }

    @Before(value = "pointCut()")
    public void  doBefore(JoinPoint joinPoint){  //连接点
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("mothod name -------:" + name);
        System.out.println(args.toString());
    }

    @After(value = "pointCut()")
    public void  doAfter(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("mothod name -------:" + name);
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("result");
    }

    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }*/
}

package com.feng.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Tomecs on 2017/9/20.
 */
public class LogAop {
    public void doLog(ProceedingJoinPoint proceedingJoinPoint){
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

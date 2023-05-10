package com.sample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInvokedMethodNameAspectProcessor {

   @Before("@within(com.sample.aspect.LogInvokedMethodName)")
   public void logMethodName(JoinPoint joinPoint) {
     System.out.println(joinPoint.getTarget().getClass()+"."+joinPoint.getSignature().getName());
   }
}

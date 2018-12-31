package com.ajay.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
@Component
public class AroundAspect {
	private Logger log = LoggerFactory.getLogger(this.getClass());

//	 @Around("execution(* com.ajay.jpa.ControllerClass.showRcCount(..))")
//	   public void around(ProceedingJoinPoint joinpoint) throws Throwable {
//		long start = System.currentTimeMillis();
//		joinpoint.proceed();
//		long timetaken = System.currentTimeMillis()-start;
//		log.info("interceptor Around method is running {} and time taken is", joinpoint);
//
//	}
}

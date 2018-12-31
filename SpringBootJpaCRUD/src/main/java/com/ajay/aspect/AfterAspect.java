package com.ajay.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
@Component
public class AfterAspect {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@After("execution(* com.ajay.jpa.*.*(..))")
	public void before(JoinPoint joinpoint) {

		log.info("interceptor method is running - {}" + joinpoint);

	}

	@AfterReturning(value = "execution(* com.ajay.jpa.*.*(..))", returning = "returns")
	public void afterReturn(JoinPoint joinpoint, Object returns) {

		log.info("interceptor method is running after returns - {}", returns);

	}
	
	@AfterThrowing(value = "execution(* com.ajay.aspect.*.*(..))", throwing = "returns")
	public void afterThrow(JoinPoint joinpoint, Object returns) {

		log.info("interceptor method is running after returns - {}", returns);

	}
}

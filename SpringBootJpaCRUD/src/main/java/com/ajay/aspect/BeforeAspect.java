package com.ajay.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ajay.jpa.ControllerClass;
@Aspect
@Configuration
@Component
public class BeforeAspect {
	private  Logger log=LoggerFactory.getLogger(this.getClass());
	@Before("execution(* com.ajay.jpa.*.*(..))")
  public void before(JoinPoint joinpoint)
  {
	  
	 log.info("interceptor method is running - {}"+ joinpoint); 
	  
  }
}

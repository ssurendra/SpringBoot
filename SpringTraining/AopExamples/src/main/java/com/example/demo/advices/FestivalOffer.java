package com.example.demo.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class FestivalOffer {

	@Before("execution(* com.example.demo.ifaces.DiscountService.*(..))")
	public void pongalOffer(JoinPoint jp) {
	 log.info("Pongal Offer called on" + jp.METHOD_CALL);	
	}
	
	@Around("execution(* com.example.demo.domains.*.*(..))")
	public Object pongalOffer(ProceedingJoinPoint jp) throws Throwable  {
	 log.info("First part of Around  called on");
	 
	 
	 Object obj = jp.proceed();
	 if(obj instanceof Number) {
		 Double current = (Double)obj;
		 obj = current +0.5;
	 }
	 log.info("Second Part of Around is called");
	 return obj; 
	}
}

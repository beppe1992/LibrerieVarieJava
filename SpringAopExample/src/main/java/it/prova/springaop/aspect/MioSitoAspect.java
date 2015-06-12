package it.prova.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by arx50011 on 12/06/2015.
 */

@Aspect
public class MioSitoAspect {

	@Before("execution(* it.prova.springaop.service.MioSitoService.loginSuMioSito(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("il metodo loginSuMioSito sta per essere eseguito");
	}

	@After("execution(* it.prova.springaop.service.MioSitoService.*get*(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("il metodo " + joinPoint.getSignature()
				+ " e' stato eseguito");
	}

	@AfterReturning(pointcut = "execution(* it.prova.springaop.service.MioSitoService.loginSuMioSito(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out
				.println("Il metodo loginSuMioSito ha restituito : " + result);

	}

	@AfterThrowing(pointcut = "execution(* it.prova.springaop.service.MioSitoService.metodoInErrore())", throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("Metodo andato in errore : " + error);

	}
}

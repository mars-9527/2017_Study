package cn.helloan.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class OneAspect {
	
	@Pointcut("execution (* cn.helloan.service.EmployeeService.getEntityById(..))")
	private void method() {}
	
	
	@Before("method() && args(id)")
	public void checkSecurity(int id){
		System.out.println("	前置通知，安全检查---------");
		System.out.println("前置通知参数打印：id--"+id);
	}
	
	@AfterReturning("method()")
	public void checkSecurityAfterReturning()
	{
		System.out.println("	后置通知，安全检查---------");
	}
	@After("method()")
	public void checkSecurityAfter()
	{
		System.out.println("	最终通知，安全检查---------");
	}
	@AfterThrowing("method()")
	public void checkSecurityAfterThrowing()
	{
		System.out.println("	例外通知，安全检查---------");
	}
	@Around("method()")
	public Object checkSecurityAround(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("	环绕通知进入**************************");
		Object obj = pjp.proceed();
		Object[] args = pjp.getArgs();
		System.out.println("环绕通知参数打印：id--"+(Integer)args[0]);
		System.out.println("	环绕通知结束**************************");
		return obj;
	}	

}

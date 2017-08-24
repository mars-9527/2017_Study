package cn.helloan.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class OneAspect {
	
	@Pointcut("execution (* cn.helloan.service.Impl.EmployeeService.getEntityById(..))")
	private void method() {}
	
	
	@Before("method()")
	public void checkSecurity(){
		System.out.println("	前置通知，安全检查---------");
	}
	


}

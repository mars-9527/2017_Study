package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class MyAspect {
	
	//声明一个切入点并配置,UserServiceImpl类中的delete方法进行拦截
		@Pointcut("execution (* aop.service.impl.UserServiceImpl.delete(..))")
		private void anyMethod() {}
		
		
		@Before("anyMethod()")
		public void checkSecurity()
		{
			System.out.println("	前置通知，安全检查---------");
		}
		@AfterReturning("anyMethod()")
		public void checkSecurityAfterReturning()
		{
			System.out.println("	后置通知，安全检查---------");
		}
		@After("anyMethod()")
		public void checkSecurityAfter()
		{
			System.out.println("	最终通知，安全检查---------");
		}
		@AfterThrowing("anyMethod()")
		public void checkSecurityAfterThrowing()
		{
			System.out.println("	例外通知，安全检查---------");
		}	
		@Around("anyMethod()")
		public Object checkSecurityAround(ProceedingJoinPoint pjp) throws Throwable
		{
			System.out.println("	环绕通知进入**************************");
			Object obj = pjp.proceed();
			System.out.println("	环绕通知结束**************************");
			return obj;
		}	
	/* 【方法输入参数的精细化定义,按照输入参数匹配】
		 * 最上面的pointcut定义了对com.ailk.service.impl.UserServiceImpl.delete类包下的
		 * delete方法有效它可以接受任何参数，下面是更精细化的配置，要求输入
		 * 参数还要有long uuid,String name两个才行，可以当做是delete(long uuid,String name)
		 * 这样的方法才起效。
		 * */
		@Before("anyMethod() && args(uuid,name)")
		public void checkSecurity(long uuid,String name)
		{
			System.out.println("	前置通知，安全检查有参数---------");
		}	
		/* 【方法输入参数的精细化定义，通过切面获得方法的返回值】
		 * 最上面的pointcut定义了对com.ailk.service.impl.UserServiceImpl.delete类包下的
		 * delete方法有效它可以接受任何参数，下面是更精细化的配置，要求方法返回值的必须是String类型
		 * 的才起效且可以捕捉到方法调用时的返回值。
		 * */	
		@AfterReturning(pointcut="anyMethod()",returning="retValue")
		public void checkSecurityAfterReturning(String retValue)
		{
			System.out.println("	后置通知，安全检查---------"+retValue);
		}


}

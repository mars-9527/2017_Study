package aop.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGlibProxyImpl implements MethodInterceptor {

	private Object targetObject;

	public Object getProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		// 用于生成代理对象
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(this.targetObject.getClass());
		// 设置回调对象为本身
		enhancer.setCallback(this);
		return enhancer.create();
	}

	
	
	private void checkSecurity(){
		System.out.println("安全检查---CGLIB实现--");
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		checkSecurity();
		return proxy.invoke(targetObject,args);
	}	


}

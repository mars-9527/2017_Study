package wish.designmodel._21flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 亨元工厂，用来创建并管理Flyweight对象。它主要是用来确保合理地共享Flyweight，当用户请求一个Flyweight时，
 * FlyweightFactory对象提供一个已创建的实例或者创建一个
 */
public class FlyweightFactory {
	private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

	public FlyweightFactory(){
		//可预先实例化好
//		flyweights.put("X", new ConcreteFlyweight());
//		flyweights.put("Y", new ConcreteFlyweight());
//		flyweights.put("Z", new ConcreteFlyweight());
	}
	
	/**
	 * 根据客户端请求，获取已有对象或生成实例。
	 * @param key ： 根据key来判断是否已生成过此对象
	 */
	public Flyweight getFlyweight(String key){
		//也可使用时再实例化
		if(!flyweights.containsKey(key))
			flyweights.put(key, new ConcreteFlyweight());
		return flyweights.get(key);
	}
}

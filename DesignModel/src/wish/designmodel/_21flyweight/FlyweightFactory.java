package wish.designmodel._21flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ��������������������Flyweight��������Ҫ������ȷ������ع���Flyweight�����û�����һ��Flyweightʱ��
 * FlyweightFactory�����ṩһ���Ѵ�����ʵ�����ߴ���һ��
 */
public class FlyweightFactory {
	private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

	public FlyweightFactory(){
		//��Ԥ��ʵ������
//		flyweights.put("X", new ConcreteFlyweight());
//		flyweights.put("Y", new ConcreteFlyweight());
//		flyweights.put("Z", new ConcreteFlyweight());
	}
	
	/**
	 * ���ݿͻ������󣬻�ȡ���ж��������ʵ����
	 * @param key �� ����key���ж��Ƿ������ɹ��˶���
	 */
	public Flyweight getFlyweight(String key){
		//Ҳ��ʹ��ʱ��ʵ����
		if(!flyweights.containsKey(key))
			flyweights.put(key, new ConcreteFlyweight());
		return flyweights.get(key);
	}
}

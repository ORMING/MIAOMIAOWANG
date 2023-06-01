package chapter15.src.com.hspedu.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DAO<T> {//泛型类
	private Map<String,T>map = new HashMap<>();
	
	public T get(String id) {
		return map.get(id);
	}
	
	public void update(String id,T entity) {
		map.put(id, entity);
	}
	//遍历map[k-v],将map的 所有value(T entity),封装到ArrayList
	public List<T>List(){
		//创建Arraylist
		List<T> list = new ArrayList<>();
		//遍历map
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			//map.get(key)返回的就是User对象-ArrayList
			list.add(map.get(key));//也可以直接使用本类的get方法get(Key)
		}
		
		return list;
	}
	public void delete(String id) {
		map.remove(id);
	}
	public void save(String id,T entity) {//把entity保存到map
		map.put(id, entity);
		
	}
}

package com.hspedu.Map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("all")
public class MapSource_ {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("no1", "张无忌");//k-v
		map.put("no2", "孙一峰");//k-v
		
		//1 k-v 最后是 HashMap$Node node = new Node (hash,key,value,null)
		//2 k-v 为了方便程序员的遍历,还会 创建 EntrySet 集合, 该集合存放的元素的类型 Entry,面一个Entry
		//	对象就有k,v EntrySet<Entry<k,v>> 即: transient Set<Map.Entry<K,V>> entrySet;
		//3 entrySet 中,定义的类型是 Map.Entry,但是实际上存放的还是 HashMap$Node
		//  这是因为 HashMap$Node implements 实现了Map.Entry 接口
		//4 当把 HashMap$Node 对象 存放到 entrySet 就方便我们的遍历,因为 Map.Entry 提供了重要的方法
		//  K getKey():V getValue();
		
		Set set = map.entrySet();
		System.out.println(set.getClass());// HashMap$EntrySet
		for (Object object : set) {
			//System.out.println(object.getClass());//HashMap$Node
			//为了从 HashMap$Node 取出k-v
			//1 先向下转型
			Map.Entry entry = (Map.Entry)object;
			System.out.println(entry.getKey()+ "-" + entry.getValue());
		}
			
		
		
	}
}

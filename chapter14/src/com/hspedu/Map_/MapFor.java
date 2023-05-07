package com.hspedu.Map_;

import java.security.DrbgParameters.NextBytes;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("all")
public class MapFor {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("邓超", new Book("", 100));// OK
		map.put("邓超", "孙俪");// 替换-> 一会分析源码
		map.put("王宝强", "马蓉");// OK
		map.put("宋喆", "马蓉");// OK
		map.put("刘令博", null);// OK
		map.put(null, "刘亦菲");// OK
		map.put("鹿晗", "关晓彤");// OK
		map.put("hsp", "hsp 的老婆");
		
		//第一组,先取出 所有的Key ,通过key 取出相应的Value
		Set keySet = map.keySet();
		//1 增强for
		System.out.println("====第一种方式====");
		for (Object key : keySet) {
			System.out.println(key + "-" + map.get(key));	
		}
		//2 迭代器
		System.out.println("====第二种方式====");
		Iterator iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Object key = (Object) iterator.next();
			System.out.println(key + "-" + map.get(key));	
		}
		//第二组,把所有的Value取出
		Collection values = map.values();
		//这里可以使用所有的Collection使用的遍历方法
		//1 增强for
		System.out.println("====取出所有values====");
		for (Object object : values) {
			System.out.println(values);
		}
		//2 迭代器
		System.out.println("====取出所有values====");
		Iterator iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			Object object = (Object) iterator2.next();
			System.out.println(values);
		}
		
		//第三组:通过EntrySet 来获取 k-v
		Set entrySet = map.entrySet();
		//1 增强for
		for (Object entry : entrySet) {
			//将entry 转成 Map.Entry
			Map.Entry m =(Map.Entry) entry;
			System.out.println(m.getKey()+ "-" + m.getValue());
			
		}
		//2 迭代器
		Iterator iterator3 = entrySet.iterator();
		while (iterator3.hasNext()) {
			Object entry = (Object) iterator3.next();
//			System.out.println(next.getClass());
			//向下转型 Map.Entry
			Map.Entry m =(Map.Entry) entry;
			System.out.println(m.getKey()+ "-" + m.getValue());
			
		}
	}
}

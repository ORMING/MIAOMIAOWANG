package com.hspedu.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("all")
public class Homework03 {
	
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("jack", 650);
		m.put("tom",1200);
		m.put("smith",2900);
		System.out.println(m);
		m.put("jack", 2600);//更新替換
		System.out.println(m);
		//為所有員工加薪100
		//keySet
		Set keySet = m.keySet();
		for (Object key : keySet) {
			//更新
			m.put(key, (Integer)m.get(key)+100);
		}
		System.out.println(m);
		//遍歷 EntrySet
		Set entrySet = m.entrySet();
		//迭代器
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry.getKey()+ "-" + entry.getValue());
			
		}
		Collection values = m.values();
		for (Object object : values) {
			System.out.println(object);
		}
	}
}



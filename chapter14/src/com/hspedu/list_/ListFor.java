package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@SuppressWarnings("unused")
public class ListFor {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
//		List list = new Vector();
//		List list = new LinkedList();
		
		list.add("jack");
		list.add("tom");
		list.add("包子");
		list.add("皇上");
		list.add("通商宽衣");
		
		//遍历
		//1 迭代器
		System.out.println("======迭代器======");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		//2增强for
		System.out.println("======增强for======");
		for (Object object : list) {
			System.out.println(object);
		}
		
		//3普通for
		System.out.println("======普通for======");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
}

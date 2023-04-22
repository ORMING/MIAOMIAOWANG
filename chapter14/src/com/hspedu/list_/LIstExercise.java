package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIstExercise {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 0; i < 12; i++) {
			list.add("hello"+ i);
		}
		System.out.println("list="+ list);
		
		//在二号位插入一个元素
		list.add(1, "无线连");
		System.out.println("list="+ list);
		
		//获取第五个元素
		System.out.println("第五个元素="+ list.get(4));
		
		//删除第六个元素
		list.remove(5);
		System.out.println("list="+ list);
		
		//修改第七个元素
		list.set(6, "修宪称帝当皇帝");
		System.out.println("list="+ list);
		
		//使用迭代器遍历
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = (Object) iterator.next();
			System.out.println("obj=" + obj);
		}
		
	}
}

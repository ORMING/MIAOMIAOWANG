package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		//add:添加单个元素
		list.add("jack");
		list.add(10);//会自动装箱
		list.add(true);
		System.out.println("list"+list);
		//remove:删除指定元素
//		list.remove(0);//删除第一个元素
		list.remove(true);//指定删除对应元素
		System.out.println("list"+list);
		//contains:查找元素是否存在
		System.out.println(list.contains("jack"));
		//size:获取元素的个数
		System.out.println(list.size());
		//isEmpty:判断是否为空
		System.out.println(list.isEmpty());
		//clear:清空
		list.clear();
		System.out.println("list"+list);
		//addALL:添加多个元素
		ArrayList list2 = new ArrayList();
		list2.add("我青年时代就读过");
		list2.add("《西游记》");
		list2.add("《水浒传》");
		list2.add("《西游记》");
		list.addAll(list2);
		System.out.println("list"+list);
		//removeAll:删除多个元素
		list.add("《中国的红色政权为什么能够存在？》");
		list.removeAll(list2);
		System.out.println("list"+list);
		
	}
}

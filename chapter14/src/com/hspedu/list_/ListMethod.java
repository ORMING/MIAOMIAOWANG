package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("习近平");
		list.add("李强");
		// void add(int index, Object ele):在 index 位置插入 ele 元素
		//在index = 1的位置插入一个对象
		list.add(1,"王志安");//如果没有标明前面的位置默认在最后添加
		System.out.println("list="+ list);
		//boolean addAll(int index, Collection eles):从 index 位置将 eles的所有元素添加进来
		List list2 = new ArrayList();
		list2.add("奥巴马");
		list2.add("马克龙");
		list.add(1, list2);
		System.out.println("list="+ list);
		//Object get(int index):获取指定index位置的元素
		
		//int indexOf(Object obj):返回obj在集合中首次出现的位置
		System.out.println(list.indexOf("王志安"));
		//int lastIndxOf(Object obj):返回obj在集合中最后一次出现的位置
		list.add("习近平");
		System.out.println("list="+ list);
		System.out.println(list.lastIndexOf("习近平"));
		//Object remove(int index):移除指定index位置的元素,并返回此元素
		System.out.println(list.remove(0));
		
		System.out.println("list="+list);
		//Object set(int index,Object ele):设置指定位置index位置的元素为ele,相当于替换
		list.set(1, "莉咔酱");//这个索引一定要存在
		System.out.println("list="+list);
		//LIst subList(int fromIndex, int toLndex):返回从fromLndex到toIndex位置的子集合
		//注意返回的子集合 fromLndex <= subLIst < toIndex
		List returnList = list.subList(0, 3);
		System.out.println("returnList=" + returnList);
		
		
	}
}

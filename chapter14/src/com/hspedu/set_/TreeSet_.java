package com.hspedu.set_;


import java.util.Comparator;
import java.util.TreeSet;
@SuppressWarnings("all")
public class TreeSet_ {
	public static void main(String[] args) {
		
		
		//1 当我们使用无参构造器,创建TreeSet时,仍然是无序的
		//2 老师希望添加的元素,按照字符串大小来排序
		//3 使用TreeSet提供的一个构造器,可以传入一个比较器(匿名)
		//  并指定排序规则
//		TreeSet treeSet = new TreeSet();
		//添加数据
		TreeSet treeSet = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1,Object o2) {
				//调用String的compareTo方法进行字符串大小的比较
				return ((String)o1).compareTo((String)o2);
			}
		});
		treeSet.add("jack");
		treeSet.add("tom");
		treeSet.add("sp");
		treeSet.add("a");
		
		System.out.println("treeSet="+ treeSet);
	}
}

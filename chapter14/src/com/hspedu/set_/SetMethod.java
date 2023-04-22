package com.hspedu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@SuppressWarnings("all")
public class SetMethod {
	
	public static void main(String[] args) {
		//1 以set 接口的实现类 HashSet 来讲解Set 接口的方法
		//2 set 接口的实现类的对象(set接口对象),不能存放重复的元素,可以添加一个null
		//3 set 接口对象存放数据是无序的(即添加顺序和取出的顺序不一致)
		//4 注意:取出的顺序的顺序虽然不是添加的顺序,但是他是固定的
		Set set = new HashSet();
		set.add("john");
		set.add("lucy");
		set.add("john");//重复	
		set.add("jack");
		set.add(null);
		set.add(null);//再次添加null
		
		System.out.println("set=" + set);
		
		//遍历
		//方式1 使用迭代器
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println("obj="+ object);
		}
		set.remove(null);
		
		//方式2 增强for
		for (Object object : set) {
			System.out.println("o="+ object);
		}
	}
}

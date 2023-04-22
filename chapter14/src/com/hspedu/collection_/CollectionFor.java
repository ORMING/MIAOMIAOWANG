package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionFor {
	@SuppressWarnings("all")
	public static void main(String[] args) {
	Collection col = new ArrayList();
		
		col.add(new Book("《红楼梦》","曹雪芹",50));
		col.add(new Book("《西游记》","吴承恩",60));
		col.add(new Book("《水浒传》","施耐庵",45));
		col.add(new Book("《三国演义》","罗贯中",55));
		col.add(new Book("《儒林外史》","吴敬梓",40));
		col.add(new Book("《1984》","乔治·奥威尔",36.5));
		
		//使用增强for
		for (Object book : col) {
			System.out.println("book" + book);
		}
		//增强for也可以在数组中使用
	}
}

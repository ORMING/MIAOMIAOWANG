package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Colletionlterator {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection col = new ArrayList();
		
		col.add(new Book("《红楼梦》","曹雪芹",50));
		col.add(new Book("《西游记》","吴承恩",60));
		col.add(new Book("《水浒传》","施耐庵",45));
		col.add(new Book("《三国演义》","罗贯中",55));
		col.add(new Book("《儒林外史》","吴敬梓",40));
		col.add(new Book("《1984》","乔治·奥威尔",36.5));
		
		//System.out.println("col=" + col);
		//现在希望遍历 col集合
		//1 先得到 col 对应的 迭代器
		Iterator iterator = col.iterator();
		//2 使用 while 遍历循环
//		while (iterator.hasNext()) {//判断是否还有数据
//			//返回下一个元素,类型是obj
//			Object obj = iterator.next();
//			System.out.println("obj" + obj);
//			
//		}
		//快捷键,快速生成 还是用代码补全把
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println("object" + object);
		}
		//3 退出while循环后,这是iterator迭代器,指向最后的元素
//		iterator.next();//NoSuchElementException
		//4如果还想再次遍历,需要重置迭代器
		iterator = col.iterator();
		System.out.println("=====第二次遍历=====");
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println("object" + object);
		}
		
		
		
	}
}
class Book{
	private String name;
	private String author;
	private double price;
	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvthor() {
		return author;
	}
	public void setAvthor(String avthor) {
		this.author = avthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return"Book{" +
	            "name='" + name + '\'' +
	            ", author='" + author + '\'' +
	            ", price=" + price +
	            '}';
	}
	
}
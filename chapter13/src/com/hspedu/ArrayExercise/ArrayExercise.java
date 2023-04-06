package com.hspedu.ArrayExercise;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Book[] books = new Book[4];
		books[0] = new Book("红楼梦",100);
		books[1] = new Book("金瓶梅新版",90);
		books[2] = new Book("青年文摘20年", 50);
		books[3] = new Book("java从入门到入土", 300);
		//1 price从大到小
		Arrays.sort(books, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO 自动生成的方法存根
				Book book1 = (Book)o1;
				Book book2 = (Book)o2;
				
				double priceVal = book2.getPrice() - book1.getPrice();
				//这里进行一个转换
				if(priceVal > 0) {
					return -1;
				}else if (priceVal < 0) {
					return 1;
				}else {
					return 0;
				}
			}

		});
		System.out.println(Arrays.toString(books));
		
		//名字长度来排列
		Arrays.sort(books,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Book book1 = (Book)o1;
				Book book2 = (Book)o2;
				return book1.getName().length() - book2.getName().length();
			}
			
		});
		System.out.println(Arrays.toString(books));
	}
}
class Book{
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	private double price;

	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		 return "Product{" +
         "name='" + name + '\'' +
         ", price=" + price +
         '}';
	}
	
}

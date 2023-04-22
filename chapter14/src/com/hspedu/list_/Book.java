package com.hspedu.list_;

public class Book {
	private String name;
	private String author;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return"Book{" +
        "名称:" + name +
        "\t\t价格" + price +
        "\t\t作者" + author +
        '}';
	}
	
}

package com.hspedu.homework;

import java.util.ArrayList;
import java.util.Iterator;
@SuppressWarnings("all")
public class Homework02 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		Car car = new Car("寶馬",40000);
		Car car2 = new Car("賓利",5000000);
		//1.add添加元素
		arrayList.add(car);
		arrayList.add(car2);
		System.out.println(arrayList);
		//2.remove:刪除指定元素
		arrayList.remove(car);
		System.out.println(arrayList);
		//3.Contains:查找元素是否存在
		System.out.println(arrayList.contains(car));
		//4.size:獲取元素個數
		System.out.println(arrayList.size());
		//5.isEmpaty:判斷是否為空
		System.out.println(arrayList.isEmpty());
		//6.clear:清空
//		arrayList.clear();
		System.out.println(arrayList);
		//7.addAll:添加多個元素
		System.out.println(arrayList);
		arrayList.addAll(arrayList);//兩個賓利
		//8.containsAll:查找多個元素是否都存在
		arrayList.containsAll(arrayList);
		//9.removeAll:刪除多個元素
		arrayList.removeAll(arrayList);//相當於清空
		//*使用增强for和 迭代器來遍歷所有的car,需要重寫 Car 的toString
		for (Object o : arrayList) {
			System.out.println(o);
		}
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
}
class Car{
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
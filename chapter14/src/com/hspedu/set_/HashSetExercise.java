package com.hspedu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
@SuppressWarnings("all")
public class HashSetExercise {
	
	private static Iterator iterator;

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add(new Employee("milan",18));
		hashSet.add(new Employee("smith",28));
		hashSet.add(new Employee("milan",18));
		iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println(hashSet);
	}
}
//创建Employee对象
class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	//如果name 和 age 值相同,则返回相同的hash值
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}

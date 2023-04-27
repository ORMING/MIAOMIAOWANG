package com.hspedu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
@SuppressWarnings("all")
public class HashSetExercise02 {
	private static Iterator iterator;

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		Employee02 e1 = new Employee02("Alice", "1000", new MyDate(1990, 1, 1));
		Employee02 e2 = new Employee02("Bob", "2000", new MyDate(1995, 2, 2));
		Employee02 e3 = new Employee02("Charlie", "3000", new MyDate(2000, 3, 3));
		Employee02 e4 = new Employee02("Charlie", "3000", new MyDate(2000, 3, 3));
		hashSet.add(e1);
		hashSet.add(e2);
		hashSet.add(e3);
		hashSet.add(e4);
		hashSet.add(new Employee02("Charlie", "3000", new MyDate(2000, 3, 3)));
		
//		System.out.println(hashSet);
		iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
	}
}
class Employee02{
	private String name;
	private String sal;
	private MyDate birthday;
	public Employee02(String name, String sal, MyDate birthday) {
		super();
		this.name = name;
		this.sal = sal;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public int hashCode() {
		return Objects.hash(birthday, name, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee02 other = (Employee02) obj;
		return Objects.equals(birthday, other.birthday) && Objects.equals(name, other.name)
				&& Objects.equals(sal, other.sal);
	}
	@Override
	public String toString() {
		return "Employee02 [name=" + name + ", sal=" + sal + ", birthday=" + birthday + "]";
	}
	
	
}
class MyDate{
	
	
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	int year;
	int month;
	int day;
	public static MyDate of(int year, int month, int day) {
	    return new MyDate(year, month, day);
	}

	
	@Override
	public String toString() {
		return "year + month + day ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
}
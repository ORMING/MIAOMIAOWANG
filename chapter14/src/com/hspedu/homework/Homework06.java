package com.hspedu.homework;

import java.util.HashSet;
import java.util.Objects;
@SuppressWarnings("all")
public class Homework06 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Person p1 = new Person(1001, "AA");
		Person p2 = new Person(1002,"BB");
		set.add(p1);
		set.add(p2);
		p1.name = "CC";
		set.remove(p1);
		System.out.println(set);
		set.add(new Person(1001,"CC"));
		System.out.println(set);
		set.add(new Person(1001,"AA"));
		System.out.println(set);
	}
}
class Person{
	public Person( int id ,String name) {
		super();
		this.name = name;
		this.id = id;
	}
	public String name;
	public int id;
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
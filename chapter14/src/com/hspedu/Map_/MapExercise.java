package com.hspedu.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("all")
public class MapExercise {
	public static void main(String[] args) {
		//完成代码
		Map hashMap = new HashMap();
		//添加数据
		hashMap.put(1, new Emp("黄旭东",300000, 1));
		hashMap.put(2, new Emp("孙一峰",21000, 2));
		hashMap.put(3, new Emp("法人",12000, 3));
		
		
		//遍历
		//1使用keySet
		Set keySet = hashMap.keySet();
		for (Object key : keySet) {
//			System.out.println(hashMap);
			//先获取value
			Emp emp = (Emp)hashMap.get(key);
			if(emp.getSal()>18000) {
				System.out.println(emp);
			}
		}
		//2使用EntrySet
		Set entrySet = hashMap.entrySet();
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			//通过entry 取得key 和 value
			Emp emp =(Emp) entry.getValue();
			if(emp.getSal() > 18000) {
				System.out.println(emp);
			}
		}
	}
}
class Emp{
	public Emp(String name, double sal, int id) {
		super();
		this.name = name;
		this.sal = sal;
		this.id = id;
	}
	private String name;
	private double sal;
	private int id;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
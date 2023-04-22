package com.hspedu.list_;

import java.util.ArrayList;
@SuppressWarnings("all")
public class ArrayListDetail {
	public static void main(String[] args) {
		
		
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(null);
		arrayList.add("jack");
		arrayList.add(null);//可以放如null
		//底层是用数组实现的
		System.out.println(arrayList);
	}
}

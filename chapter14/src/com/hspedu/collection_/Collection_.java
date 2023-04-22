package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		//1 集合主要是两组(单列集合,双列集合)
		//2 Collection 接口有两个重要的子类接口 List Set ,他们的子类都是单列集合
		//3 Map 接口的实现子类 是双列集合,存放的 k-v
		//4 实现的接口要背
		//Collection
		//Map
		ArrayList arrayList = new ArrayList();
		arrayList.add("jack");
		arrayList.add("tom");
		
		HashMap hashMap = new HashMap();
		hashMap.put("N01", "北京");
		hashMap.put("N02", "上海");
	}
}

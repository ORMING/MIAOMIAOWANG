package com.hspedu.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@SuppressWarnings("all")
public class Collections_ {
	public static void main(String[] args) {
		//创建ArrayList 集合 用于测试
		List list = new ArrayList();
		list.add("波特王");
		list.add("八炯");
		list.add("徐某人");
		list.add("小翠");
		System.out.println("list=" + list);
		//revaerse(list):反轉 List 中元素的順序
		Collections.reverse(list);
		System.out.println("list=" + list);
		//shuffle(List):對list 元素進行隨機排序
		for (int i = 0; i < 5; i++) {
			Collections.shuffle(list);
			System.out.println("list=" + list);
		}
		//sory(List)根據元素的自然順序指定 List 集合元素按升序排序
		Collections.sort(list);
		System.out.println("自然排序");
		System.out.println("list="+list);
		//sort(List,Comparator):根據指定的 Comparator 產生的順序 對 List合集來排序
		//如果我們希望按照字符串長度來排序
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO 自动生成的方法存根
				//可以加入校驗代碼
				return ((String)o2).length() - ((String)o1).length();
			}
		});
		System.out.println("字符串長度排序="+ list);
		//swap(List,int,int):將指定 list 集合中的 i 処元素和 j 処的元素交換
		//比如
		Collections.swap(list, 0, 3);
		System.out.println("交換后的情況");
		System.out.println("lsit="+ list);
		
		//Object max(Collection):根據元素的自然順序,返回給指定集合中的最大元素
		System.out.println("自然順序的最大元素="+Collections.max(list));
		//Object max(Collection, Comparator):根據Comparator 指定的順序,返回給定集合中的最大元素
		//比如我們要返回長度最大的元素
		Collections.max(list,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO 自动生成的方法存根
				return ((String)o2).length() - ((String)o1).length();
			}
		});
		System.out.println(list);
		//Object min(Collection)
		//Object min(Collection, Comparator)
		//同上
		//int frequency(Collection, Objict):該元素在集合中出現的次數
		System.out.println("徐某人出現的次數="+ Collections.frequency(list, "徐某人"));
		//void copy(LIst dest,List src):將src中的内容複製到dest中
		ArrayList dest = new ArrayList();
		//爲了完成一個完整的靠譜需要獻給dest賦值,大小和list.size()一樣
		for(int i = 0;i<list.size();i++) {
			dest.add("");
		}
		//拷貝
		Collections.copy(dest, list);
		System.out.println("dest="+dest);
		//boolean replaceAll():替換元素
		Collections.replaceAll(list, "徐某人", "老徐");
		System.out.println("替換後"+list);
			
	}
}

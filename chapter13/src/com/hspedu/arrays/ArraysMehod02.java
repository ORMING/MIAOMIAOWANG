package com.hspedu.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMehod02 {
	public static void main(String[] args) {
		Integer[] arr = {1,2,90,123,567};
		//bingarySearch 通过二分搜索法进行查找,要求必须排好
		//1,使用 binarySearch 二叉查找
		//2,要求数组是有序的,如果该数组是无序的,不能使用binarySearch
		//3,如果数组中不存在该元素,就返回-(low + 1);low代表他应该存在的地方
		int index = Arrays.binarySearch(arr, 92);
		System.out.println(index);
		
		//copyOf数组元素的复制
		//1,从arr数组中,拷贝 arr.length个元素到 newArr数组中
		//2,如果拷贝的长度>arr.length 就在新数组后面增加 null
		//3,如果拷贝的长度<0 就抛出异常NegativeArraySizeException
		Integer[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println("============");
		System.out.println(Arrays.toString(newArr));
		
		//ill 数组元素的填充
		Integer[] num = new Integer[] {9,3,2};
		//1,使用 99 去填充 num数组,可以理解成是替换原理的元素
		Arrays.fill(num, 99);
		System.out.println("===========");
		System.out.println(Arrays.toString(num));
		
		//equals 比较两个数组内容是否完全一致
		Integer[] arr2 = {1,2,90,123};
		//1,如果arr 和 arr2 数组的元素一样,则返回 true
		//2,如果不是完全一样,就返回 false
		
		boolean equals =Arrays.equals(arr, arr2);
		System.out.println(equals);
		
		//asList 将一组值,转换成List
		//1,asList方法,会将(2,3,4,5,6,1)数据转成一List集合
		//2,返回
		List<Integer> asList = Arrays.asList(2,3,4,5,6,1);
		System.out.println(asList);
		
	}
}

package com.hspedu.arrays;

import java.util.Comparator;

public class ArrayaSortCustom {
	public static void main(String[] args) {
		int[] arr = {1,-1,8,0,20};
		bubble01(arr);
		System.out.println("排序后");
		System.out.println(arr.toString());
		
	}
	//使用冒泡完成排序
	public static void bubble01(int[] arr) {
		int temp = 0;
		for(int i = 0;i < arr.length -1 ;i++) {
			for(int j = 0; j<arr.length - 1 - i;j++) {
				//从小到大
				if(arr[j]>arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1]=temp;
				}
			}
		}
	}
	//结合冒泡 + 定制
	public static void bubble02(int[]arr,Comparator c) {
		int temp = 0;
		for(int i = 0;i < arr.length -1 ;i++) {
			for(int j = 0; j<arr.length - 1 - i;j++) {
				//从小到大
				if(c.compare(arr[j],arr[j + 1])>0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1]=temp;
				}
			}
		}
	}
}

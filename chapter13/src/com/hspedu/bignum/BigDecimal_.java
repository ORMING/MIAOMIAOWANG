package com.hspedu.bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
	public static void main(String[] args) {
		//当我们需要保存一个精度很高的数时,double不够用了
		//可以使用 BigDecimal
		BigDecimal bigDecimal = new BigDecimal("1911.2314123524616457237126571278");
		BigDecimal bigDecimal2 = new BigDecimal("1.1");
		System.out.println(bigDecimal);
		
		//1 如果对 BigDecimal进行运算,比如加减乘除,需要对应的方法
		//2 ,创建一个需要操作的 BigDecimal 然后调用对应的方法即可
		System.out.println(bigDecimal.add(bigDecimal2));//加
		System.out.println(bigDecimal.subtract(bigDecimal2));//减
		System.out.println(bigDecimal.multiply(bigDecimal2));//乘
//		System.out.println(bigDecimal.divide(bigDecimal2));//除,这个可能会抛出异常ArithmeticException,出现无限循环就会抛出异常
		//解决方案 在调用该方法时指定精度即可 BigDecimal.ROUND_CEILING
		//如果有无限循环小数,就会保留 分子 的精度
		System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
	}
}

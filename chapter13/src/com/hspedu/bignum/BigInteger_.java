package com.hspedu.bignum;

import java.math.BigInteger;

public class BigInteger_ {
	public static void main(String[] args) {
//		long l = 234324232333333333;
		//当编程中需要处理很大的整数,long就不够用了
		//就可以使用BigInteger的类来搞定
		BigInteger bigInteger = new BigInteger("2324465346343564364523455");
		System.out.println(bigInteger);
		BigInteger bigInteger2 = new BigInteger("107858545735757357468426240");
		//1 在对BigInteger 加减乘除的时候,需要时使用对应的方法,不能直接使用运算符
		//2 可以创建一个 要操作的BigInteger 然后进行相应的操作
		BigInteger add = bigInteger.add(bigInteger2);
		System.out.println(add);//加
		BigInteger subtract = bigInteger.subtract(bigInteger2);
		System.out.println(subtract);//减
		BigInteger multiply = bigInteger.multiply(bigInteger2);
		System.out.println(multiply);//乘
		BigInteger divide = bigInteger.divide(bigInteger2);
		System.out.println(divide);//除
		
	}
}

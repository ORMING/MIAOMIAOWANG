package com.hspedu.string_;

public class StringMethod02 {
	public static void main(String[] args) {
		//1 toUpperCase转换成大写
		String s = "hello";
		System.out.println(s.toUpperCase());
		//2 toLowerCase
		System.out.println(s.toLowerCase());
		//3 concat拼接字符串
		String s1 = "宝玉";
		s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
		System.out.println(s1);
		//4 replace 替换字符串中的字符
		s1 = "宝玉 and 薛宝钗 薛宝钗 薛宝钗";
		//在s1中,将 所有的 林黛玉 替换成薛宝钗
		//s1.repalace() 方法执行后返回的结构才是替换过的内容,对本身的s1没有任何变化
		s1 = s1.replace("薛宝钗","林黛玉");
		System.out.println(s1);
		//5 split 分割字符串,对某些分割字符,我们需要 转义比如|\\等
		String poem = "实际上那些错误执行者,他也是有一本账的,这个账是记在那儿的,一旦他出事了,这个账全给你拉出来了,别看你今天闹得欢,小心今后拉清单,这都得应验的,不要干这种事情,头上三尺有神明,一定要有敬畏之心";
		//1 以,为标准对poem分割,返回一个数组
		//2 对字符串进行分割时,如果有特色字符,需要加入 转义符\
		String[] split = poem.split(",");
//		String poem = "E:\\aaa\\bbb";
//		String[] split = poem.split("\\|");
//		String[] split = poem.split("\\\\");
//		String[] split = poem.split("\\\\");
		System.out.println("=========");
		for(int i = 0;i < split.length;i++) {
			System.out.println(split[i]);
		}
		//6 toCharArray 转换成字符数组
		s = "happy";
		char[] chas = s.toCharArray();
		for(int i = 0;i<chas.length;i++) {
			System.out.println(chas[i]);
		}
		//7 compareTo比较两个字符串的大小,如果前者大,
		//则返回正数,后者大,则返回负数,如果相等,返回0
		//(1)如果长度相同,并且每个字符也相同,就返回0
		//(2)如果长度相同或不同,但是在进行比较大小时,可以区分大小
		// 就返回if(c1!=c2){
			//return c1 - c2;
			//}
		String a ="jchn";
		String b ="jack";
		System.out.println(a.compareTo(b));
		//8 format 格式化字符串
		String name = "john";
		int age = 10;
		double score = 98.3/3;
		char gender = '男';
		//将所有信息拼接到一个字符串中
		String info = 
				"我的姓名是"+"年龄是"+age+"成绩是"+score+"性别是"+gender+"希望大家喜欢我";
		System.out.println(info);
		
		/*%s：表示字符串类型的参数。
		%d：表示整数类型的参数。
		%f：表示浮点数类型的参数。.2f表示保留小数点后2位,并且4舍5入
		%b：表示布尔类型的参数。
		%c：表示字符类型的参数。chat
		%n：表示换行符。
		%t：表示时间日期类型的参数，后面可以跟上具体的时间日期格式。
		*/ 
		//以上统称为占位符
		String info2 = String.format("我的姓名是%s 年龄是%d 成绩是%2.2f 性别是%c 希望大家喜欢我" , name,age,score,gender);
		System.out.println(info2);
	}
}

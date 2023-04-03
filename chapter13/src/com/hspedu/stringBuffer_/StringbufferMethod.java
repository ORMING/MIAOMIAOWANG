package com.hspedu.stringBuffer_;

public class StringbufferMethod {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		//增
		s.append(',');//"hello,"
		s.append("张山峰");//"hello,张山峰"
		s.append("赵敏").append(100).append(true).append(10.5);//"hello,张山峰赵敏100true10.5"
		System.out.println(s);

		//删
		/*
		 * 删除索引为>=start&&<end处的字符
		 * 解读: 删除11~14的字符[11,14)
		 */
		s.delete(11, 14);
		System.out.println(s);
		//改
		s.replace(9, 11, "习包子");
		System.out.println(s );
		//查找指定的子串第一次出现的索引,如果找不到返回-1
		int indxeOd = s.indexOf("张山峰");
		System.out.println(indxeOd);
		//插
		//h在索引为9的位置插入赵敏,原来为9的内容自动后移
		s.insert(9,"黄旭东");
		System.out.println(s);
		//长度
		System.out.println(s.length());
		
		
	}
}

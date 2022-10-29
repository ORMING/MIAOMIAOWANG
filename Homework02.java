public class Homework02{
	public static void main(String[] args) {
		//使用char類型，分別保存 \n \t \r \\ 1 2 3等字符，並打印輸出
		char c1 = '\n';//換行
		char c2 = '\t';//制表位 ctrl+d
		char c3 = '\r';//回車
		char c4 = '\\';//輸出\
		char c5 = '1';//輸出1
		char c6 = '2';//輸出2
		char c7 = '3';//輸出3
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		//保存兩本書名用+拼接看效果，保存兩個性別，用加號拼接，看效果。保存兩本書的價格用加號拼接
		String book1 = "書1";
		String book2 = "書2";
		System.out.println(book1 + book2);
		//性別用char保存
		char c8 = '男';
		char c9 = '女';
		System.out.println(c8 + c9);
		//保存兩本書的價格
		double price1 = 123.45;
		double price2 = 100.12;
		System.out.println(price1 + price2);//就數字相加
		String name ="jack";
		int age = 20;
		double score = 80.9;
		char gender = '男';
		String hobby = "打籃球";
		System.out.println("姓名\t年齡\t成績\t性別\t愛好\n" +
		name +"\t" + age + "\t" + score + "\t" + gender + "\t" + hobby);
		
		
		
		
	}
}
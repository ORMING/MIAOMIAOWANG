package chapter15.src.com.hspedu.generic;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
public class GenericDetail {
	public static void main(String[] args) {
		//1.給汎型指向數據類型是,要求是引用類型,不能是基本數據類型
		List<Integer> list = new ArrayList<Integer>();//ok
//		List<int> list = new ArrayList<int>();//錯誤
		
		//2.
		//因爲 E 指定了 A 類型,構造器傳入了 new A()
		//給汎型指定具體類型后,可以傳入該類型或者及其子類型
		Pig<A> apig = new Pig<A>(new A());
		Pig<A> apig2 = new Pig<A>(new B());;
		
		//3.汎型的使用形式
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		//實際開發中一般簡寫
		//編譯器會進行類型推斷,推薦寫法
		ArrayList<Integer> list3 = new ArrayList<>();
		List<Pig> pig = new ArrayList<>();
		
		//4.如果這樣寫默認是 汎型默認是 Object
		ArrayList arrayList = new ArrayList();//等價 ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("xx");
		
		Tiger tiger = new Tiger();
		/*
		 * class Tiger<E>{
				Object e;
				public Tiger() {}
			
				public Tiger(Object e) {
					super();
					this.e = e;
				}
			}
		 */
	}
}
class Tiger<E>{
	E e;
	public Tiger() {}

	public Tiger(E e) {
		super();
		this.e = e;
	}
}
class A{}
class B extends A{}
class Pig<E>{
	public Pig(E e) {
		super();
		this.e = e;
	}

	E e;
	
}
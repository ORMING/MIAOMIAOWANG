package chapter15.src.com.hspedu.generic;
@SuppressWarnings("all")
public class Generic03 {
	public static void main(String[] args) {
		Person<String> person = new Person<String>("123");
		person.t();
		/*
		 * 可以這樣理解,上面的Person類
		 * class Person<String>{
			String s;//E表示 s的數據類型,該數據類型在定義Person對象的時候指定,即在編譯期間,就確定E是什麽類型

			public Person(String s) {//E也可以是參數類型
			super();
			this.s = s;
		}

	
	
			public String f() {//返回類型使用E
				return s;
			}
			}
		 */
		Person<Integer> person2 = new Person<Integer>(100);
		person2.t();
		/*
		 * class Person<Integer>{
				Integer s;//E表示 s的數據類型,該數據類型在定義Person對象的時候指定,即在編譯期間,就確定E是什麽類型
			
				public Person(Integer s) {//E也可以是參數類型
					super();
					this.s = s;
				}
			
				
				
				public Integer f() {//返回類型使用E
					return s;
				}
			}

		 */
	}
}
//汎型的作用是:可以在類聲明時通過一個標識表示類中某個屬性的類型,
//猴子是某個方法返回值的類型,或者是參數類型
class Person<E>{
	E s;//E表示 s的數據類型,該數據類型在定義Person對象的時候指定,即在編譯期間,就確定E是什麽類型

	public Person(E s) {//E也可以是參數類型
		super();
		this.s = s;
	}

	
	
	public E f() {//返回類型使用E
		return s;
	}
	public void t() {
		System.out.println(s.getClass());//顯示s的運行類型
	}
}

package chapter08.com.hspedu.object_;

public class EqualsExercise02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person_ p1 = new Person_();
		p1.name = "hspedu";
		Person_ p2 = new Person_();
		p2.name = "hspedu";
		
		System.out.println(p1 == p2);
		System.out.println(p1.name.equals(p2.name));
		System.out.println(p1.equals(p2));
		
		String s1 = new String("asdf");
		String s2 = new String("asdf");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}

}
class Person_{
	public String name;
}
package chapter08.com.hspedu.object_;

public class HashCode_ {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AA aa = new AA();
		AA aa2 = new AA();
		AA aa3 = aa;
		
		System.out.println("aa.hashcode()=" + aa.hashCode());
		System.out.println("aa2.hashcode()=" + aa2.hashCode());
		System.out.println("aa3.hashcode()=" + aa3.hashCode());
	}

}
class AA{}
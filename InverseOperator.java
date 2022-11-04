public class InverseOperator {
	public static void main(String[] args) {
		//! 操作是取反 t->f , f->t
		System.out.println(60 > 20);//t
		System.out.println(!(60 > 20));//f
		//a^b:叫做邏輯異或，儅a和b不同的時候，結果為true，否則為false
		boolean b = (10 > 1)^(3 < 5);
		System.out.println("b=" + b);//f
	}
}
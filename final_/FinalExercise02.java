package chapter10.com.hspedu.final_;

public class FinalExercise02 {
	
}
class Something{
	public int addOne(final int x) {//这个地方也可以用final
//		++x;//错误，原因是不能修改final x的值
		return x + 1;//这样是可以的
	}
}

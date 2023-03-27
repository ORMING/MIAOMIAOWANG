package chapter11.hspedu.enum_;

public class EnumDetail {
	public static void main(String[] args) {
		Music.CLSSICMUISC.playing();
	}
}

//1 使用enum 关键字后,就不能再继承其他类了,因为 enum会隐式继承Enum,而java是单继承机制
//enum Season3 extends A{
//	
//}
//2 enum 实现的枚举类,任然是一个类,所以还是可以实现接口的
interface Iplaying{
	public void playing();
}
enum Music implements Iplaying{
	CLSSICMUISC;

	@Override
	public void playing() {
		// TODO 自动生成的方法存根
		System.out.println("播放音乐");
	}
	
}

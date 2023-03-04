package chapter08.com.hspedu.Homework05;

public class Test {
	public void Worker(){
		Waiter waiter = new Waiter("扎实的", 233);
		waiter.println();
		Teacher teacher = new Teacher("颐使气指的教师爷", 231, 13, 32);
		teacher.println();
		Scientist scientist = new Scientist("斯塔特满", 231);
		scientist.setBonus(300);
		scientist.println();
		Peasant peasant = new Peasant("剩饭", 322);
		peasant.println();
	}
}

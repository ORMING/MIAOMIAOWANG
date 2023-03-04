package chapter08.com.hspedu.object_;

public class ToString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * Object的toSting()源码
		 * (1)getClass().getName()类的全类包名（包名+类名）
		 * (2)Integer.toHexSting(hashCode())将对象的hashCode值转成16进制的字符串
		 * public String toString(){
		 * 		return getClass().getName() + "@" + Integer.toHexSting(hashCode());
		 */
		Monster monster = new Monster("小妖怪", "巡山的", 1000);
		System.out.println(monster.toString()+ "hashcode=" + monster.hashCode());
		System.out.println(monster);
	}

}
class Monster{
	private String name;
	private String job;
	private double sal;
	public Monster(String name, String job, double sal) {
		super();
		this.name = name;
		this.job = job;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	//重写toSting方法输出快捷方法
	//是同快捷键即可
	@Override
	public String toString() {//重写后，一般是吧对象的属性值输出，也可以直接设定
		// TODO 自动生成的方法存根
		return "Monster{" + '\''+
		"name=" + name +'\''+
		",sal=" + sal +
		'}';
		
	}
}



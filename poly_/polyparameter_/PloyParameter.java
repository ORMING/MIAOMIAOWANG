package chapter08.com.hspedu.poly_.polyparameter_;


public class PloyParameter {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Worker tom = new Worker("tom", 2500);
		Manger milan = new Manger("milan",5000,200000);
		PloyParameter ployParameter = new PloyParameter();
		ployParameter.showEmpAnnual(tom);
		ployParameter.showEmpAnnual(milan);
	}
	public void showEmpAnnual(Employee e) {
			System.out.println(e.getAnnual());
		}
	//添加一个方法，testWork,如果普通员工，调用work方法，如果是经理，则调用manage方法
	public void testWork(Employee e) {
		if(e instanceof Worker) {
			((Worker)e).work();
		}else if (e instanceof Manger) {
			((Manger)e).manage();
		}else {
			System.out.println("不做处理");
		}
	}
}

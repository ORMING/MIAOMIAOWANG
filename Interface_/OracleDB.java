package chapter10.com.hspedu.Interface_;

public class OracleDB implements DBInterface{

	@Override
	public void connect() {
		// TODO 自动生成的方法存根
		System.out.println("连接oracle");
	}

	@Override
	public void close() {
		// TODO 自动生成的方法存根
		System.out.println("关闭oracle");
	}
	
}

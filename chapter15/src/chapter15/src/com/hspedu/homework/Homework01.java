package chapter15.src.com.hspedu.homework;

import java.util.List;

import org.junit.Test;

public class Homework01 {
	public static void main(String[] args) {
		
	}
	@Test
	public void testList() {
		//说明
		//我们这里给T指定类型是User
		DAO<User> dao = new DAO<>();
		dao.save("001", new User(1,10,"jack"));
		dao.save("002", new User(2,18,"king"));
		dao.save("003", new User(3,38,"smith"));
		
		List<User> list = dao.List();
		System.out.println("list="+list);
		
		dao.update("003", new User(3,58,"milan"));
		
		System.out.println("修改后");
		list = dao.List();
		System.out.println("list="+list);
		
		System.out.println("id=003 " + dao.get("003"));
		
	}
}

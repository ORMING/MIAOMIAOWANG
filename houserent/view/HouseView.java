package chapter08.com.hspedu.houserent.view;

import chapter08.com.hspedu.houserent.domain.House;
import chapter08.com.hspedu.houserent.service.houseservice;
import chapter08.com.hspedu.houserent.utils.Utility;

/*
 * 1显示界面
 * 2接收用户输入
 * 3调用houseService完成对房屋信息的各种操作
 */
public class HouseView {
	private boolean loop = true;// 接收显示
	private char key = ' ';// 接收用户选择的
	private houseservice houseservice = new houseservice(10);// 设置数组大小为10

	// 更据ID修改房屋信息
	public void update() {
		System.out.println("=============修改房屋信息===========");
		System.out.println("请选择修改房屋编号（-1）表示退出");
		int updateId = Utility.readInt();
		if (updateId == -1) {
			System.out.println("=============你放弃放弃修改房屋信息==============");
			return;
		}
		// 根据输入得到的updateId，查找对象
		House house = houseservice.findById(updateId);
		// 返回的是引用类型【即：就是数组的元素】
		// 因此在后面对house.setxx()，就会修改houseservice中houses的元素
		if (house == null) {
			System.out.println("================修改房屋信息编号不存在。。===================");
			return;
		}
		System.out.print("姓名(" + house.getName() + "):");
		String name = Utility.readString(8, "");// 如果这里用户直接回车代表不修改，默认“”
		if (!"".equals(name)) {// 修改
			house.setName(name);

		}
		System.out.print("电话(" + house.getPhone() + "):");
		String phone = Utility.readString(12, "");// 如果这里用户直接回车代表不修改，默认“”
		if (!"".equals(phone)) {// 修改
			house.setPhone(phone);
		}
		System.out.print("地址(" + house.getAddress() + "):");
		String Address = Utility.readString(18, "");// 如果这里用户直接回车代表不修改，默认“”
		if (!"".equals(Address)) {// 修改
			house.setAddress(Address);
		}
		System.out.print("租金(" + house.getRent() + "):");
		int rent = Utility.readInt(-1);
		if (rent != -1) {// 修改
			house.setRent(rent);
		}
		System.out.print("状态(" + house.getState() + "):");
		String state = Utility.readString(3, "");// 如果这里用户直接回车代表不修改，默认“”
		if (!"".equals(state)) {// 修改
			house.setState(state);
		}
		System.out.println("修改房屋信息成功");
	}

	// 根据ID查找房屋信息
	public void findHouse() {
		System.out.println("============查找房屋信息============");
		System.out.println("请输入要查找的id：");
		int finId = Utility.readInt();
		// 调用方法
		House house = houseservice.findById(finId);
		if (house != null) {
			System.out.println(house);
		} else {
			System.out.println("===========查找id不存在==============");
		}
	}

	// 完成退出确认
	public void exit() {
		// 这里使用Utility提供的方法完成确认
		char c = Utility.readConfirmSelection();
		if (c == 'Y') {
			loop = false;
		}

	}

	// 编写delhouse（）接收输入的id，调用Service 的del方法
	public void delHouse() {
		System.out.println("========添加房屋信息=======");
		System.out.print("请输入待删除房屋的编号（-1）退出");
		int delId = Utility.readInt();
		if (delId == -1) {
			System.out.println("========放弃删除房屋信息=======");
			return;// return表示结束程序
		}

		char choice = Utility.readConfirmSelection();// 该方法不呢是就有循环判断逻辑必须输入Y/N
		if (choice == 'Y') {// 真的删除信息
			if (houseservice.del(delId)) {
				System.out.println("========删除房屋信息成功=======");
			} else {
				System.out.println("========房屋信息不存在删除失败=======");
			}
		} else {
			System.out.println("========放弃删除房屋信息=======");
		}
	}

	// 编写addHouse（）接收输入，创建House对象，调用add方法

	public void addHouse() {
		System.out.println("========添加房屋=======");
		System.out.print("姓名：");
		String name = Utility.readString(8);
		System.out.print("电话：");
		String phone = Utility.readString(12);
		System.out.print("地址：");
		String address = Utility.readString(16);
		System.out.print("月租：");
		int rent = Utility.readInt();
		System.out.print("状态：");
		String state = Utility.readString(3);
		// 创建一个新的House对象，注意id 是系统分配的，用户不能输入
		House newHouse = new House(0, name, phone, address, rent, state);
		if (houseservice.add(newHouse)) {
			System.out.println("=========添加房屋成功==========");
		} else {
			System.out.println("=========添加房屋失败==========");
		}
	}

	// 编写listHouses()显示房屋列表
	public void listHouses() {
		System.out.println("==========房屋列表=========");
		System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
		House[] houses = houseservice.list();
		for (int i = 0; i < houses.length; i++) {
			if (houses[i] == null) {// 如果显示到没有的数组就退出
				break;
			}
			System.out.println(houses[i]);
		}
		System.out.println("=========房屋列表显示完毕========");
	}

	// 显示主菜单
	public void mainMenu() {
		do {
			System.out.println("\n========房屋出租系统========");
			System.out.println("\t\t\t1新增房源");
			System.out.println("\t\t\t2查找房屋");
			System.out.println("\t\t\t3删除房屋信息");
			System.out.println("\t\t\t4修改房屋信息");
			System.out.println("\t\t\t5房屋列表");
			System.out.println("\t\t\t6退出");
			System.out.println("请输入你的选择1~6");
			key = Utility.readChar();
			switch (key) {
			case '1':
				addHouse();

				break;
			case '2':
				findHouse();

				break;
			case '3':
				delHouse();

				break;
			case '4':
				update();

				break;
			case '5':
				listHouses();

				break;
			case '6':
				// 这里使用Utility提供的方法完成确认

				exit();
				break;

			}
		} while (loop);
	}
}

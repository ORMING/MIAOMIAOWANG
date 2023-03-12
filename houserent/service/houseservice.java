package chapter08.com.hspedu.houserent.service;
/*
	 * HouseService.java<=>类[业务层]
	 * 1响应HouseView的调用
	 * 2完成对房屋信息的各种操作（增删改查c[create]r[read]u[update]d[delete]）
	 */

import chapter08.com.hspedu.houserent.domain.House;

public class houseservice {
	private House[] houses;//保存House对象
	private int houseNums = 0;//记录当前有多少个房屋信息
	private int idCounter = 0;
	public houseservice(int size) {
		//new houses
		houses =  new House[size];//当创建HouseService对象时，指定数组大小
		
	}
	
	//findById方法，返回House对象或者null
//	public House findById(int findId) {
//		//遍历数组
//		for (int i = 0; i < houses.length; i++) {
//			if (findId == houses[i].getId()) {
//				return houses[i];			
//			}
//			
//		}
//		return null;
//	}
/*
 * 根据你提供的错误信息来看，错误是在 findById() 方法中发生的，具体的错误原因是由于 this.houses[i] 为 null，导致无法调用 getId() 方法。

这种错误通常是由于 houses 数组中包含了 null 值，而调用 findById() 方法时传入了一个非法的房屋 ID，导致代码尝试访问一个空值对象。

要解决这个问题，你可以在 findById() 方法中添加一个条件判断来避免访问空值对象。例如，你可以检查 houses[i] 是否为 null，如果是，则直接跳过当前循环迭代，继续下一次迭代。

以下是一种可能的实现方式：chatGPT牛逼
 */
	public House findById(int findId) {
	    //遍历数组
	    for (int i = 0; i < houses.length; i++) {
	        if (houses[i] == null) {
	            continue; // 如果当前房屋对象为null，跳过当前迭代
	        }
	        if (findId == houses[i].getId()) {
	            return houses[i];          
	        }
	    }
	    // 如果没有找到匹配的房屋，直接返回null
	    return null;
	}

	
	
	//del方法，删除一个房屋信息
	public boolean del(int delId) {
		//应当找到删除房屋信息对应的下标
		//强调一定要搞清楚下标和房屋编号不一样
		int index = -1;
		for(int i = 0; i < houseNums; i++) {
			if(delId == houses[i].getId()) {//要删除的房屋（id），是数组下标为i的元素
				index = i;//就使用index记录i
			}
		}
		if(index == -1 ) {//说明delID不在数组中
			return false;
		}
		//如果找到
		for(int i = index; i < houseNums - 1;i++) {
			houses[i] = houses[i+1];//用后一个数据覆盖上一个直到最后一个，最后一个在设置为null
		}
		houses[--houseNums] = null;//把当前存在的房屋信息的最后一个设置为空
		return true;
	}
	//add方法，添加新对象，返回boolean
	public boolean add(House newHouse) {
		//判断是否可以继续添加(暂时不考虑扩容问题)
		if(houseNums >= houses.length) {//不能再添加
			System.out.println("数组已满，不能再添加。。");
			return false;		
		}
		//把newhouse对象加入到
		houses[houseNums++] = newHouse;
//		houseNums++;//新增加了一个房屋
		//我们还需要设计一个id自增长的机制
		idCounter++;
		newHouse.setId(idCounter);
		return true;
	}
	//list方法，返回houses
	public House[] list() {
		return houses;
	}
	
}

package chapter11.hspedu.enum_;

public class EnumMethod {
	public static void main(String[] args) {
		//使用Season02 枚举类来演示各种方法
		Season02 autumn = Season02.AUTUMN;
		//输出枚举对象的名字
		System.out.println(autumn.name());
		
		//ordinal() 输出的该枚举对象的次序/编号,从0开始编号
		//AUTUMN 么巨大对象是第四个,因此输出3
		System.out.println(autumn.ordinal());
		
		//从反编译可以看出 values方法,返回Season2[]
		//含有所有枚举对象
		Season02[] values = Season02.values();
		System.out.println("==遍历取出枚举对象(增强for)==");
		for(Season02 season: values) {//增强for循环
			System.out.println(season);
		}
		
		//valueOf:将字符串转换成枚举对象,要求字符串必须VT为已有的常量名,否则报错
		//执行流程
		//1 更据你输入的"AUTUMN" 到 Season2的枚举对象去查找
		//2 如果找到了,就返回,如果没找到,就报错
		Season02 autum1 = Season02.valueOf("AUTUMN");
		System.out.println("autum1=" + autum1);
		System.out.println(autumn == autum1);
		
		//compareTo: 比较两个枚举常量 , 比较的就是编号
		//1 就是把 Season2.AUTUMN 枚举对象的 和 Season2.SUMMER枚举对象的编号比较
		//2 看看结果
		/*
		 * public final int compareTo(E o){
		 *   return self.ordinal - other.ordinal;
		 *   }
		 *   Season02.AUTUMN 的编号[4]  - Season02.SUMMER 的编号[3]
		 */
		
		System.out.println(Season02.AUTUMN.compareTo(Season02.SUMMER));
		
		//补充一个增强for循环
		int[] nums = {1,2,3};
		//普通for循环
		System.out.println("=====普通for循环=====");
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=====增强for循环=====");
		for(int i : nums) {//执行流程是 依次从nums数组中取出数据,赋给i,如果取出完毕则退出for循环
			System.out.println("i=" + i);
		}
		
	}
}

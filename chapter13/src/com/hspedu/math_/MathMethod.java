package com.hspedu.math_;

public class MathMethod {
	public static void main(String[] args) {
		//Math常用方法(静态方法)
		//1.abs绝对值
		int abs = Math.abs(-9);
		System.out.println(abs);
		//2.pow求幂
		double pow = Math.pow(2, 4);//2的4次方
		System.out.println(pow);
		//3.ceil 向上取整,返回>=该参数的最小整数
		double ceil = Math.ceil(-3.000012);
		System.out.println(ceil);
		//4.floor 向下取整,返回<=该参数的最大整数
		double floor = Math.floor(-4.999);
		System.out.println(floor);//4.0
		//5.round 四舍五入 Math.floor(该参数+0.5)
		long round = Math.round(5.51);
		System.out.println(round);//6
		//6.sqrt 求开方
		double sqrt = Math.sqrt(9.0);
		System.out.println(sqrt);//3.0
		//7.random 求随机数
		// random 返回的是 0 <= x < 1 之间的一个随机小数
		// 思考：请写出获取 a-b 之间的一个随机整数,a,b 均为整数 ，比如 a = 2, b=7
		// 即返回一个数 x 2 <= x <= 7
		// 老韩解读 Math.random() * (b-a) 返回的就是 0 <= 数 <= b-a
		// (1) (int)(a) <= x <= (int)(a + Math.random() * (b-a +1) )
		// (2) 使用具体的数给小伙伴介绍 a = 2 b = 7
		// (int)(a + Math.random() * (b-a +1) ) = (int)( 2 + Math.random()*6)
		// Math.random()*6 返回的是 0 <= x < 6 小数
		// 2 + Math.random()*6 返回的就是 2<= x < 8 小数
		// (int)(2 + Math.random()*6) = 2 <= x <= 7
		// (3) 公式就是 (int)(a + Math.random() * (b-a +1) )
		for(int i = 0; i < 100; i++) {
		System.out.println((int)(2 + Math.random() * (7 - 2 + 1)));
		}
/*首先，Math.random() 方法会返回一个大于等于 0.0 且小于 1.0 的随机浮点数。因此，我们需要对其进行缩放，使其在指定的范围内生成随机数。

具体来说，假设要在 [min, max] 这个范围内生成随机整数，可以按照以下步骤进行：

计算出范围的大小：range = max - min + 1。
生成一个大于等于 0 且小于等于 range - 1 的随机整数：int randomNumInRange = (int)(Math.random() * range)。
将上一步生成的随机整数加上 min，得到最终的随机数：int randomNum = randomNumInRange + min。
为什么要进行这样的计算呢？这是因为我们需要让随机数的范围与指定的范围相匹配。例如，如果要在 [1, 10] 这个范围内生成随机整数，那么范围的大小为 10，因此需要生成一个大于等于 0 且小于等于 9 的随机整数。生成的随机整数再加上 1，就可以得到 1 到 10 之间的随机整数了。

需要注意的是，由于 Math.random() 方法返回的是随机浮点数，因此在将其转换为整数时需要进行类型转换，并且可能存在精度问题。如果需要更高精度的随机数，可以使用 java.util.Random 类。*/
		//max , min 返回最大值和最小值
		int min = Math.min(1, 9);
		int max = Math.max(45, 90);
		System.out.println("min=" + min);
		System.out.println("max=" + max);
	}
}

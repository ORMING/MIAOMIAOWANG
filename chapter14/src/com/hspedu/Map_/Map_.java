package com.hspedu.Map_;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("all")
public class Map_ {
	public static void main(String[] args) {
		//Map接口实现类的特点
		//1 Map与Collection并列存在.用于保存具有映射关系的数据:Key-Value(双列元素)
		//2 Map 中的 Key 和 value 可以是任何引用类型的数据,会封装到HashMap$Node 对象中
		//3 Map 中的 Key 不允许重复,原因和HashSet 一样,前面分析过源码
		//4 Map 中的 value 可以重复
		//5 Map 的key 可以为 null,value 也可以为null,注意 key 为null,
		// 只能有一个,value 为null,可以多个
		//6 常用String类作为Map的 key
		//7 key 和 value 之间存在单向一对一关系,即通过指定的 key 总能找到相应的 value
		
		Map map = new HashMap();
		map.put("no1", "洗净平");//k-v
		map.put("no2", "莉咔酱");//k-v
		map.put("no1", "川普");//但有相同的k,就等价于替换
		map.put("no3", "川普"	);//k-v
		map.put(null, null);//k-v
		map.put(null, "abs");//等价替换
		map.put("no4", null);
		map.put("no5", null);
		map.put(1, "zore");
		map.put(new Object(), "一角驴");
		//通过get方法传入一个key,会返回对应的value
		System.out.println(map.get("no3"));
		System.out.println(map);
	}
}

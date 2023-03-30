package com.hspedu.try_;

public class TryCatchExercise01 {
	public static int method() {
		try {
			String[] names = new String[3];//name = null
			if((names[1]).equals("tom")) {//NullPointerException 空指针
				System.out.println(names[1]);
			}else {
				names[3]="hspedu";
			}
			return 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			return 2;
		} catch (NullPointerException e) {
			return 3;//因为空指针先返回这个
		}finally {
			return 4;//必须执行覆盖之前输出的3
		}
		
	}
	public static void main(String[] args) {
		System.out.println(method());
	}
}

package chapter11.hspedu.annotation_;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Deprecated_ {
	public static void main(String[] args) {
		A a = new A();
		a.hi();
		System.out.println(a.n1);
	}
}

//1 @Deprecated 修饰某个元素,表示该元素已经过时
//2 即使不再推荐使用,但是仍可以使用
//3 查看 @Deprecated 注解类的源码
//4 可以修饰方法,类,字段,包,参数,等等
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
public @interface Deprecated {
    */
@Deprecated
class A{
	@Deprecated
	public int n1 = 10;
	@Deprecated
	public void hi() {
		
	}
}

package chapter11.hspedu.annotation_;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings( { "all" })
public class SuppressWarnings_ {
//	@SuppressWarnings({"rawtyps","unchecked","unused"})
	public static void main(String[] args) {
		//1 当我们不希望看到这些警告的时候,可以使用 SuppressWarnings注解来抑制警告信息
		//2 在({""})中,可以写入你希望抑制(不显示)警告信息
		//3 可以指定的警告类型有
		/*
		 * all                               to suppress all warnings （抑制所有警告）
boxing                         to suppress warnings relative to boxing/unboxing operations（抑制装箱、拆箱操作时候的警告）
cast                             to suppress warnings relative to cast operations （抑制映射相关的警告）
dep-ann                       to suppress warnings relative to deprecated annotation（抑制启用注释的警告）
deprecation                 to suppress warnings relative to deprecation（抑制过期方法警告）
fallthrough                   to suppress warnings relative to missing breaks in switch statements（抑制确在switch中缺失breaks的警告）
finally                           to suppress warnings relative to finally block that don’t return （抑制finally模块没有返回的警告）
hiding                           to suppress warnings relative to locals that hide variable（）
incomplete-switch        to suppress warnings relative to missing entries in a switch statement (enum case)(忽略没有完整的switch语句)
nls                               to suppress warnings relative to non-nls string literals(忽略非nls格式的字符)
null                              to suppress warnings relative to null analysis(忽略对null的操作)
rawtypes                     to suppress warnings relative to un-specific types when using generics on class params(使用generics时忽略没有指定相应的类型)
restriction                    to suppress warnings relative to usage of discouraged or forbidden references
serial                           to suppress warnings relative to missing serialVersionUID field for a serializable class(忽略在serializable类中没有声明serialVersionUID变量)
static-access               to suppress warnings relative to incorrect static access（抑制不正确的静态访问方式警告)
synthetic-access          to suppress warnings relative to unoptimized access from inner classes（抑制子类没有按最优方法访问内部类的警告）
unchecked                to suppress warnings relative to unchecked operations（抑制没有进行类型检查操作的警告）
unqualified-field-access       to suppress warnings relative to field access unqualified （抑制没有权限访问的域的警告）
unused                      to suppress warnings relative to unused code  （抑制没被使用过的代码的警告）
 
		 */
		//4 关于SuppressWarnings 作用范围是和你放置的位置相关
		// 比如@SuppressWarnings放置在main方法,那么抑制警告的范围就是main方法
		// 通常我们可以放置具体的语句, 方法, 类
		//5 看看@SuppressWarnings的源码
		/*
		 *  @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
			@Retention(RetentionPolicy.SOURCE)
			public @interface SuppressWarnings {
   
    		String[] value();
			}
		 */
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");
		int i;
		System.out.println(list.get(1));
	}
	public void f1() {
//		@SuppressWarnings( { "rawtypes" })
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");
//		@SuppressWarnings({"unused"})
		int i;
		System.out.println(list.get(1));
	}
}


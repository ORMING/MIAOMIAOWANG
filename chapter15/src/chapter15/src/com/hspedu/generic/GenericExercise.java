package chapter15.src.com.hspedu.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericExercise {
	public static void main(String[] args) {
		//1 hashSet
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("薩格爾王",13));
		set.add(new Student("格薩爾王",13));
		set.add(new Student("通商寬衣",13));
		//2遍歷(迭代器)
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		//3hashmap
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		hashMap.put("薩格爾王", new Student("格薩爾王",13));
		hashMap.put("格薩爾王", new Student("格薩爾王",13));
		hashMap.put("通商寬衣", new Student("通商寬衣",13));
		//keySet
		Set<String> keySet = hashMap.keySet();
		for (String string : keySet) {
			System.out.println(string+hashMap.get(string) );
		}
		//entry
		Set<Entry<String, Student>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, Student>> iterator2 = entrySet.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<java.lang.String, chapter15.src.com.hspedu.generic.Student> entry = (Map.Entry<java.lang.String, chapter15.src.com.hspedu.generic.Student>) iterator2
					.next();
			System.out.println(entry.getKey()+entry.getValue());
			
		}
	}
}
class Student{
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
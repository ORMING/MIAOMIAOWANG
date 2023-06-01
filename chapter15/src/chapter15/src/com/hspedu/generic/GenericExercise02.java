package chapter15.src.com.hspedu.generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
		employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
		employees.add(new Employee("hxd", 20000, new MyDate(1980, 10, 10)));
		
		System.out.println("employees"+ employees);
		
		System.out.println("====排序====");
		employees.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO 自动生成的方法存根
				//先按照name排序,如果name相同,則按照生日日期先後.定制順序
				//先對傳入的數據驗證
				if(!(emp1 instanceof Employee && emp2 instanceof Employee)) {
					System.out.println("類型不正確");
					return 0;
				}
				//比較name
				int i = emp1.getName().compareTo(emp2.getName());
				if(i != 0) {
					return i;
				}
				//如果name相同,就比較birthday - year
				int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
				if(yearMinus != 0) {
					return yearMinus;
				}
				//如果year相同,就比較moth
				int mothMinus = emp1.getBirthday().getMonth() - emp2.getBirthday().getMonth();
				if(mothMinus != 0) {
					return mothMinus;
				}
				//如果都相同
				int dayMinus = emp1.getBirthday().getDay() - emp2.getBirthday().getDay();
				return dayMinus;
				
			}
		});
		System.out.println(employees);
	}
}


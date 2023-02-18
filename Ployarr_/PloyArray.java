package chapter08.com.hspedu.poly_.Ployarr_;

public class PloyArray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//应用实例：现在又一个继承结构如下：要求创建1个person对象
		//2个student 对象和 2个teacher对象。统一放在数组中，并调用每个对象say方法
		
		Person[] Persons = new Person[5];
		Persons[0] = new Person("jack",20);
		Persons[1] = new Student("jack",18,100);
		Persons[2] = new Student("smith", 19, 30.1);
		Persons[3] = new Teacher("scott", 30, 20000);
		Persons[4] = new Teacher("king", 50, 25000);
		
		//循环遍历多态数组，调用say方法
		for (int i = 0; i < Persons.length;i++) {
			//老师提示：person[i]编译类型是Person，运行类型是更据实际情况有JVM来判断
			 System.out.println(Persons[i].say());
			 //这里就要思考
			 if(Persons[i] instanceof Student) {//判断person[i] 的运行类型是不是Student
				 Student student = (Student)Persons[i];//向下转型
				 student.study();
				 //这里也可以使用一条语句（（(Student)Persons[i].study);
			 }else if(Persons[i] instanceof Teacher) {
				 Teacher teacher = (Teacher)Persons[i];
				 teacher.teach();
			 }else if (Persons[i] instanceof Person) {
			 }else {
				 
				 System.out.println("你的类型有误，请检查");
				 
			 }
//			 Persons[i].teach();
//			 Persons[i].study(); 
		}
	}

}

package chapter10.com.hspedu.abstract_;

public abstract class Employee {
	private String name;
	private int id;
	private double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public abstract void work();
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary 要设置的 salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

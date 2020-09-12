package Entities;

public class Person {
	
	public static final Double PERCE = 0.06;
	
	private String name;
	private int age;
	private String work;
	private double salary;
	
	
	
	public Person(){
		
	}
	
	
	public 	Person(String name, int age, String work, double salary) {
		this.name = name;
		this.age = age;
		this.work = work;
		this.salary = salary;
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void incrementSalary(double salary) {
		this.salary += salary * PERCE;
	}
	
	public String toString() {
		return "Your name is " +
				name +
				
				", your age is " +
				age +
				
				", You work as a " +
				work +
				
				" and your salary is " +
				String.format("%.2f", salary);
		
	}

}


















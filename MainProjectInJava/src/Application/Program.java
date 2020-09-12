package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Age: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("Work: ");
		String work = sc.nextLine();
		
		System.out.print("Salary: ");
		
		double salary = Double.parseDouble(sc.nextLine());
		
		Person p = new Person(name, age, work, salary);
		
		System.out.print("Work hours: ");
		double quantTime = Double.parseDouble(sc.nextLine());
		
		if (quantTime > 8.0) {
			p.incrementSalary(salary);
			System.out.println("Updated data: " + p);
		}
		else {
			System.out.println("Your Data: " + p);
			System.out.println("The end program");
		}
		
		

	}

}

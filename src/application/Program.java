package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsouredEmployee;

public class Program {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.println();
		System.out.println("Enter the number of employees: ");
		Integer colaboradores = scanner.nextInt();

		for (int i=0; i<colaboradores; i++) {
			System.out.println("Employee #" + (i + 1) + " data");
			System.out.print("Outsourced? (y/n): ");
			char ch = scanner.next().charAt(0);

			scanner.nextLine();
			System.out.print("Name:");
			String name = scanner.nextLine();

			System.out.print("Hours: ");
			Integer hours = scanner.nextInt();

			System.out.print("Value per hour:");
			Double valuePerHour = scanner.nextDouble();

			if (ch == 'y') {

				System.out.println("Additional Charge: ");
				Double additionalCharge = scanner.nextDouble();
				Employee emp = new OutsouredEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(emp);

			} else {

				Employee emp = new Employee(name, hours, valuePerHour);
				employees.add(emp);

			}

		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : employees) {
			System.out.println(emp.getName()  + " - $ " + String.format("%.2f", emp.payment()));
		}

		scanner.close();
		
	}
}

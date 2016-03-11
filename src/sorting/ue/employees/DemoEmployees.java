package sorting.ue.employees;

import java.util.Arrays;

public class DemoEmployees {

	public static void main(String[] args) {
		
		Employee[] employees = {
				new Employee(456, "Susi Sorglos", 2500.0, "Engineering"),
				new Employee(789, "Ano Nym", 4900.0, "Management"),
				new Employee(123, "Max Mustermann", 1000.0, "Engineering"),
		};
		
		System.out.println("-> before sorting:");
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		Arrays.sort(employees);
		System.out.println("-> after sorting:");
		for(Employee e : employees) {
			System.out.println(e);
		}
	}
	
}

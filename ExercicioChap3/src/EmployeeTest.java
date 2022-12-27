//import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		
		Employee renan = new Employee("Renan Augusto", "Cunha Migliaris", 1500.00);
		//System.out.print(renan);
		Employee joao =  new Employee("Joao", "das Couves", 2300.23);
		//System.out.print(joao);
		
		renan.setRaise(10);
		printEmployee(renan);
		
		joao.setRaise(10);
		printEmployee(joao);
		
			

	}
	
	private static void printEmployee(Employee employee) {
		System.out.printf("%s %s depois do aumento: %.2f ",
				employee.getName(), employee.getLastName(), employee.getSalary());	
		
	}

}

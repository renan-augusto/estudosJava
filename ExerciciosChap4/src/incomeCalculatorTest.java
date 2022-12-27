import java.util.Scanner;

public class incomeCalculatorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		incomeCalculator employee = new incomeCalculator("",0,0);
		int counter = 1;
		
		while(counter < 4)
		{
			System.out.println("Insira o nome do funcionario: ");
			employee.setName(input.next());
			System.out.println("Insira o total de horas trabalhadas: ");
			employee.setWorkedTime(input.nextDouble());
			System.out.println("Insira o valor pago por hora: ");
			employee.setHourlyWage(input.nextDouble());
			
			System.out.printf("Total de horas extras trabalhadas: %.2f%n", 
					employee.displayExtraTime(employee.getWorkedTime()));
			
			if(employee.displayExtraTime(employee.getWorkedTime()) <= 40.00)
			{
				System.out.printf("Salario total sem hora extra = %.2f%n", (employee.getHourlyWage() * 40));
			}
			else if(employee.displayExtraTime(employee.getWorkedTime()) > 40.00);
				System.out.printf("Salario total = %.2f%n", 
						employee.displayExtraTime(employee.getWorkedTime()) * 1.50 * employee.getHourlyWage() 
						+  40*employee.getHourlyWage());
			
			counter += 1;
		}
		
	}

}

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while(studentCounter <= 10)
		{
			System.out.print("Entre com o resultado (- 1 se aprovado ou 2 se reprovado) ");
			int result = input.nextInt();
			
			if(result == 1)
				passes = passes + 1;
			else 
				failures = failures + 1;
			
			studentCounter = studentCounter + 1;
		}

		System.out.printf("Passaram: %d%nReprovaram: %d%n", passes, failures);
		
		if(passes > 8)
			System.out.println("Bonus ao instrutor!!!");
		
	}

}

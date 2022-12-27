import java.util.Scanner;

public class AnalysisValidator {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		System.out.println("Bem vindo ao contador de reprovacoes e aprovacoes");
		
		while(studentCounter <= 10)
		{
			System.out.print("Entre com o resultado (1 se aprovado ou 2 se reprovado) ");
			int result = input.nextInt();
			while(result != 1 && result != 2)
			{
				if(result != 1 && result != 2)
				{
					System.out.println("Opcao invalida");
				}
				System.out.print("Entre com o resultado (1 se aprovado ou 2 se reprovado) ");
				result = input.nextInt();
				
			} 
			
			
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

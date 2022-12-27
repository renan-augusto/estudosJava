import java.util.Scanner;

public class Population {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double pop22, pop23, pop24, pop25, pop26, pop27, growthRate, calcGrowth;
		
		System.out.print("Insira aqui a população de 2022: ");
		pop22 = input.nextDouble();
		
		System.out.print("Insira aqui a taxa de crescimento populacional mundial: ");
		growthRate = input.nextDouble();
		
		
		calcGrowth = (growthRate/100) + 1;
		
		//pop23 = pop22 * calcGrowth;
		
		//System.out.printf("Teste: %f\n", pop23);
		
		//System.out.printf("População estimada de 2023: %f\n", pop22 * calcGrowth);
		
		pop23 = pop22 * calcGrowth;
		pop24 = pop23 * calcGrowth;
		pop25 = pop24 * calcGrowth;
		pop26 = pop25 * calcGrowth;
		pop27 = pop26 * calcGrowth;
		
		
		System.out.printf("A população estimada de 2023 é de: %f\n", pop23);
		System.out.printf("A população estimada de 2024 é de: %f\n", pop24);
		System.out.printf("A população estimada de 2025 é de: %f\n", pop25);
		System.out.printf("A população estimada de 2026 é de: %f\n", pop26);
		System.out.printf("A população estimada de 2027 é de: %f\n", pop27);
		

	}

}

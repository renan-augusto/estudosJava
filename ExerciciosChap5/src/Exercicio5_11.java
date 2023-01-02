//Escreva um aplicativo que localize o menor de varios numeros inteiros
//Suponha que o primeiro valor lido especifica o numero de valores a serem inseridos pelo usuario
import java.util.Scanner;

public class Exercicio5_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int ver = 0;
		int number1 = 0;
		int number2 = 0;
		
		System.out.println("Insira a quantidade de numeros a serem lidos");
		ver = input.nextInt();
//		System.out.println("Insira o numero a ser comparado: ");
//		number1 = input.nextInt();
		
		
		do {
			System.out.println("Insira o numero a ser comparado: ");
			number1 = input.nextInt();
			counter++;
			
			
		} while (counter < ver);
		
		if(number1 > number2)
		{
			number2 = number1;
		}
		
		System.out.printf("O maior numero: %d%n", number2);
		
		
			
	}

}

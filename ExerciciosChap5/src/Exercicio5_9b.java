import java.util.Scanner;
public class Exercicio5_9b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value;
		System.out.println("Insira um numero inteiro para verificar se eh par ou impar");
		value = input.nextInt();
			
		switch (value % 2)
		{
			case 0:
				System.out.print("Par");
				break;
			default:
				System.out.print("Impar");
		}
			

	}

}

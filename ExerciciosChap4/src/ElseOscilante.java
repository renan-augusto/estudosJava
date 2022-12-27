// no exercicio existem duas situacoes, comentei a primeira e testei a segunda e assim por diante
//caso queira testar, so tirar os comentarios parca.
import java.util.Scanner;

public class ElseOscilante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		
		System.out.println("Entre com o valor de x: ");
		x = input.nextInt();
		System.out.println("Entre com o valor de y: ");
		y = input.nextInt();
		
		
//		if(x < 10)
//		{
//			if(y > 10)
//				System.out.println("\n******");
//		}
//		else 
//			System.out.println("#####");
//		
//		System.out.println("$$$$$");
		
		if(x < 10)
		{
			if(y > 10)
				System.out.println("*****");
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
		}

	}

}

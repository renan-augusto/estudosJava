//TODO modificar o programa base para que sejam geradas as saidas solicitados no exercicio 4.28 do livro
import java.util.Scanner;

public class ElseOscilante2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		
		System.out.println("Entre com o valor de x: ");
		x = input.nextInt();
		System.out.println("Entre com o valor de y: ");
		y = input.nextInt();
		//para x == 5 e y == 8, quer que saiam todos os simbolos menos #
		
//		if(y == 8)
//			{
//			if(x == 5)
//				System.out.println("@@@@@");
//			}
//		else
//		{
//			System.out.println("#####");
//
//		}
//		
//		System.out.println("$$$$$");
//		System.out.println("&&&&&");
		
		//para x == 5
		
		//produzir a saida de somente @
		
//		if(y == 8)
//		{
//			if(x == 5)
//				System.out.println("@@@@@");
//		}
//		else
//		{
//			System.out.println("#####");
//			System.out.println("$$$$$");
//			System.out.println("&&&&&");
//		}
		
		//produzir a saida de # $ e & para x == 5 e y == 7
		
		if(y == 8)
		{
			if(x == 5)
				System.out.println("@@@@@");
		}
		else
		{
			System.out.println("######");
			System.out.println("$$$$$$");
			System.out.println("&&&&&&");
		}

	}

}

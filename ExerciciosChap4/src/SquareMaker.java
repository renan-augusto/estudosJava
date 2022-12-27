import java.util.Scanner;

public class SquareMaker {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sideSize = 0;
	
	System.out.print("Insira um numero de 1 a 20 para a medida do lado do seu quadrado: ");
	sideSize = input.nextInt();
	
	int i = 0;
	
	while(i++ < sideSize)
	{
		int j = 0;
		
		while(j++ < sideSize)
			System.out.print("*");
		
		System.out.print("");
		
	}
	
	}
}



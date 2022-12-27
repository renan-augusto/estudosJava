package exerciciosChap2;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1, module;
		
		System.out.print("Entre com um inteiro: ");
		num1 = input.nextInt();
		
		module = num1%2;
		
		
		if(module != 0)
			System.out.println("Numero impar");
		if(module == 0)
			System.out.println("Numero par");
		
				
		

	}

}

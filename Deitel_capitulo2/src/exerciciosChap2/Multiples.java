package exerciciosChap2;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, verifyer;
		
		System.out.println("Entre com o primeiro inteiro ");
		num1 = input.nextInt();
		System.out.println("Entre com o segundo inteiro ");
		num2 = input.nextInt();
		
		verifyer = num1 % num2;
		
		if(verifyer  == 0)
			System.out.printf("%d eh multiplo de %d", num1, num2);
		if(verifyer != 0)
			System.out.printf("%d nao eh multiplo de %d",num1, num2);

	}

}

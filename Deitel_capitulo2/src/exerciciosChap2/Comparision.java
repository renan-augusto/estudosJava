import java.util.Scanner;

public class Comparision {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        int num1, num2, num3, num4, num5;
	        
	        System.out.print("Insira o primeiro inteiro: ");
	        num1 = input.nextInt();
	        System.out.print("Insira o segundo inteiro: ");
	        num2 = input.nextInt();
	        System.out.print("Insira o terceiro inteiro: ");
	        num3 = input.nextInt();
	        System.out.print("Insira o quarto inteiro: ");
	        num4 = input.nextInt();
	        System.out.print("Insira o quinto inteiro: ");
	        num5 = input.nextInt();
	        
	        //identificando o maior 
	        if((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5))
	            System.out.printf("O maior %d\n", num1);
	        if((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5))
	        	System.out.printf("O maior %d\n", num2);
	        if((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5))
	        	System.out.printf("O maior %d\n", num3);
	        if((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5))
	        	System.out.printf("O maior %d\n", num4);
	        if((num5 > num1) && (num5 > num2) && (num5 > num3) && (num5 > num4))
	        	System.out.printf("O maior %d\n", num5);
	        
	        //identificando o menor
	        
	        if((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < num5))
	        	System.out.printf("O menor: %d\n", num1);
	        if((num2 < num1) && (num2 < num3) && (num2 < num4) && (num2 < num5))
	        	System.out.printf("O menor %d\n", num2);
	        if((num3 < num1) && (num3 < num2) && (num3 < num4) && (num3 < num5))
	        	System.out.printf("O menor %d\n", num3);
	        if((num4 < num1) && (num4 < num2) && (num4 < num3) && (num4 < num5))
	        	System.out.printf("O menor %d\n", num4);
	        if((num5 < num1) && (num5 < num2) && (num5 < num3) && (num5 < num4))
	        	System.out.printf("O menor %d\n", num5);
	        
	        

	}

}

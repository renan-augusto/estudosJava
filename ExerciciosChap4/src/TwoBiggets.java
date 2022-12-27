import java.util.Scanner;

public class TwoBiggets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int number = 0;
		int largest = 0;
		int secondLargest = 0;
		
		while(counter < 11) 
		{
			System.out.println("Entre com um numero inteiro: ");
			number = input.nextInt();
			if(number > largest)
			{
				secondLargest = largest;
				largest = number;
			}
			else if(number > secondLargest)
			{
				secondLargest = number;
			}
			counter++;
		}
		System.out.printf("Os dois maiores numeros inseridos: %d %d%n", largest, secondLargest);
	}

}

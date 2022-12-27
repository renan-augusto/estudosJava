import java.util.Scanner;

public class TheBiggestNumberFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int number = 0;
		int largest = 0;
//		int comparator = 0;
		
		while(counter < 11)
		{
			System.out.println("Entre com um numero: ");
			number = input.nextInt();
			
			if(number > largest)
			{
				largest = number;
			}
			else
				largest = largest;
			
			System.out.printf("O maior numero: %d%n", largest);
			
			counter += 1;
		}
		
		

	}

}

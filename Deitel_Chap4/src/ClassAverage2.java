import java.util.Scanner;

public class ClassAverage2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0;
		
		System.out.print("Entre com a nota ou digite -1 para sair: ");
		int grade = input.nextInt();
		
		while(grade != -1)
		{
			total = total + grade;
			gradeCounter = gradeCounter +1;
			
			System.out.print("Entre com a nota ou digite -1 para sair: ");
			grade = input.nextInt();
		}
		
		if(gradeCounter != 0)
		{
			double average = (double) total / gradeCounter;
			
			System.out.printf("%n Total de notas inseridas %d sua soma %d%n", gradeCounter, total);
			System.out.printf("Media da sala: %.2f%n", average);
			
		}
		
		else
			System.out.println("Nenhuma nota foi inserida");
	}

}

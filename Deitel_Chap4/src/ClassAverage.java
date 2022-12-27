import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0; //inicializa a soma das notas inseridas pelo usuario
		int gradeCounter = 1; //inicializa o numero da nota a ser inserido em seguida
		
		//fase de processamento utliza arepeticao controlada por contador
		
		while(gradeCounter <= 10)
		{
			System.out.print("Insira a nota: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		
		//fase de termino 
		int average = total/10;
		
		System.out.printf("%nTotal das 10 notas: %d%n", total);
		System.out.printf("Media ca classe: %d%n", average);
		

	}

}

import java.util.Scanner;


public class LetterGrades {

	public static void main(String[] args) {
		int total = 0; // soma das notas
		int gradeCounter = 0; //numero de notas inseridas
		int aCount = 0; //contagem das notas a
		int bCount = 0; //contagem das notas b
		int cCount = 0; //contagem das notas c
		int dCount = 0; //contagem das notas d
		int eCount = 0; //contagem das notas e
		int fCount = 0; //contagem das notas f
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n %s%n %s%n", "Enter the integer grades in the range 0-100",
				"Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS x type <ctrl> d then press enter", 
				"On windows type <ctrl> z then press Enter");
		//faz loop ate o usuario inserir o indicador de fim do arquivo
		while(input.hasNext())
		{
			int grade = input.nextInt(); //le a nota
			total += grade; //adiciona nota a total
			++gradeCounter; //incrementa o numero de notas
			
			switch(grade / 10)
			{
			case 9: //a nota estava entre 90
			case 10: //e 100, inclusivo
				++aCount;
				break;//sai do switch
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
			default: //a nota era menor do que 60
				++fCount;
				break;
			}
		} //fim do while
		//exibe o relatorio da nota
		System.out.printf("%nGrade report:%n");
		//se usuario inseriu pelo menos uma nota...
		if (gradeCounter != 0)
		{
			//calcula a media de todas as notas inseridas
			double average = (double)total / gradeCounter;
			
			//gera a saido de resumo de resultados
			System.out.printf("Total of the %d grades entered is %d%n", 
					gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
		}
		else 
			System.out.println("No grades were entered");
		
		

	}

}

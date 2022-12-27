import java.util.Scanner;

public class SalesCommision{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		double sum = 0;
		int item = 0;
		
		System.out.println("Bem vindo ao calculador de comissoes do renao");
		System.out.println("Selecione um dos itens vendidos ou tecle -1 para sair.");
		System.out.println("Item 1 = 239,99 Item 2 = 129,75 Item 3 = 99,95 Item 4 = 350,89");
		item = input.nextInt();
		
		while(item != -1)
		{
			if(item == 1) 
			{
				counter += 1;
				sum = sum + 239.99 * 0.09;
			}
			else if(item == 2)
			{
				counter += 1;
				sum = sum + 129.75 * 0.09;
			}
			else if(item == 3)
			{
				counter += 1;
				sum = sum + 99.95 * 0.09;
			}
			else if(item == 4)
			{
				counter += 1;
				sum = sum + 350.89 * 0.09;
			}
			else
			{
				System.out.println("Item inexistente");
			}
			
			double totalIncome = sum + 200.00;
			System.out.println("Item 1 = 239,99 Item 2 = 129,75 Item 3 = 99,95 Item 4 = 350,89 ou tecle -1 para sair");
			item = input.nextInt();
			System.out.printf("Salario final: $%.2f%n Total de itens vendidos: %d%n", totalIncome, counter);
			
		}
	}
}
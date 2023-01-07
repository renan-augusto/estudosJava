import java.util.Scanner;
public class SalesCalculatorTest {

	public static void main(String[] args) {
//		double totalPrice;
		Scanner input = new Scanner(System.in);
		int qtd = 0;
		int productN = 0;
		SalesCalculator sales = new SalesCalculator();
		
		System.out.printf("%s%n", "Entre com o id do produto (1 a 5) ou tecle -1 para sair:");
		if(productN > -1 && productN < 6) {
			 productN = input.nextInt();
		}
		else
		{
			System.out.println("Numero invalido");	
		}
			
		
		while(productN > -1 && productN < 6) {
			System.out.println("Insira a quantidade a ser comprada: ");
			qtd = input.nextInt();
			sales.addProduct(productN, qtd);
			System.out.printf("%s%n", "Entre com o id do produto (1 a 5) ou tecle -1 para sairv: ");
			productN = input.nextInt();	
		}
		System.out.printf("O total comprado: %.2f%n", sales.getTotal());
		input.close();
	}
}

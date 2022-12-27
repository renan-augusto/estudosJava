import java.util.Scanner;

public class InvoiceTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Quantos itens deseja comprar? (Teclado)");
		int desiredQtd1 = input.nextInt();
		System.out.print("Quantos itens deseja comprar? (Notebook asus)");
		int desiredQtd2 = input.nextInt();
		
		Invoice keyboard = new Invoice("12345", "Teclado mecanico", desiredQtd1, 124.50);
		Invoice notebook = new Invoice("23453", "Notebook ASUS", desiredQtd2, 5400.90);
		
		System.out.printf("O preco dos teclados: $%.2f%n",keyboard.getInvoiceAmount());
		System.out.printf("O preco dos notebooks: $%.2f%n",notebook.getInvoiceAmount());
		
	}
}

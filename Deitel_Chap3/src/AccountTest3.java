//TODO metodo displayACcount para tornar o codigo mais eficiente e sem repeticoes

import java.util.Scanner;	

public class AccountTest3 {

	
	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("Renan Augusto", -7.54);
		
		//exibe o saldo inicial de cada objeto
		//System.out.printf("%s balance: $%.2f %n",
		//		account1.getName(), account1.getBalance());
		//System.out.printf("%s balance: $%.2f %n",
		//		account2.getName(), account2.getBalance());
		account1.displayAccount();
		account2.displayAccount();
		
		//cria um Scanner para obter entrada a partir da janela de comando
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding $%.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		account1.displayAccount();
		account2.displayAccount();
		
		//exibe saldos
		//System.out.printf("%s balance: $%.2f %n", 
		//		account1.getName(), account1.getBalance());
		//System.out.printf("%s balance: $%.2f %n", 
		//		account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding $%.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		account1.displayAccount();
		account2.displayAccount();
		
		
		
		
		
		//exibe os saldos
		//System.out.printf("%s balance: $%.2f %n", 
		//		account1.getName(), account1.getBalance());
		//System.out.printf("% balance: $%.2f %n%n", 
		//		account2.getName(), account2.getBalance());
		
		
	}

}

//TODO consertar a questao de variaveis duplicadas. Observar no exemplo 3 como que passou. 

import java.util.Scanner;

public class AccountTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account3 = new Account("Fernanda Lavezzo", 50.00);
		Account account4 = new Account("Renan Augusto", 45.00);
		
		Scanner input = new Scanner(System.in);
		
		account3.displayAccount();
		account4.displayAccount();
		
		System.out.print("Entre com o valor que deseja depositar na conta da Fernanda: ");
		double depositAmount = input.nextDouble();
		account3.deposit(depositAmount);
		
		account3.displayAccount();
		account4.displayAccount();
		
		System.out.print("Entre com o valor que deseja depositra na conta do Renan: ");
		depositAmount = input.nextDouble();
		account4.deposit(depositAmount);
		
		account3.displayAccount();
		account4.displayAccount();
		
		System.out.print("Quanto deseja retirar na conta da Fernanda? ");
		double withdrawAmount = input.nextDouble();
		account3.withdraw(withdrawAmount);
		
		account3.displayAccount();
		account4.displayAccount();
		
		System.out.print("Quanto deseja retirar na conta Renan? ");
		withdrawAmount = input.nextDouble();
		account4.withdraw(withdrawAmount);
		
		account3.displayAccount();
		account4.displayAccount();
		
		
	}

}

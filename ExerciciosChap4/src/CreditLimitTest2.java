import java.util.Scanner;

public class CreditLimitTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		CreditLimit2 client = new CreditLimit2(0,0,0,0,0);
		
		int newBalance;
		
		System.out.println("Bem vindo ao Renao crediario!");
		System.out.println("Por favor, insira o numero da conta ou -1 para sair: ");
		client.setAcc(input.nextInt());
		
		while(client.getAcc() != -1)
		{
			System.out.println("Entre com o saldo atual: ");
			client.setBalance(input.nextInt());
			System.out.println("Entre com as cobrancas totais: ");
			client.setTotalCharge(input.nextInt());
			System.out.println("Insira os creditos utlizados pelo cliente: ");
			client.setTotalCredits(input.nextInt());
			System.out.println("Qual o limite de credito do cliente? ");
			client.setCreditLimit(input.nextInt());
			
//			client.newBalance(client.getBalance(), client.getTotalCharge(), client.getTotalCredits());
			
			newBalance = client.getBalance() + client.getCreditLimit() - client.getTotalCharge();
			
			if(newBalance > client.getTotalCredits())
			{
				System.out.println("Atencao! Limite Excedido!!");
			}
			else
			{
				System.out.printf("Aprovado!%n Acc: %d%n%d%nNovo Saldo:",
						client.getAcc(), newBalance);
			}
				
			System.out.println("Entre com a nova conta ou com -1 para sair: ");
			client.setAcc(input.nextInt());			
			
		}
		
		System.out.println("Obrigado por utilizar o Renao Bank");

	}

}

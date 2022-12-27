//TODO consumo do cliente total descontando  do saldo com credito
//barrar quando exceder o credito atualizado
//parar as solicitacoes do programa quando insiro o menos 1
//ANINHAR O if antes do while para tentar parar o programa!!!!
import java.util.Scanner;

public class CreditLimitTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		CreditLimit client = new CreditLimit(0, 0, 0);
		
		while(client.getAcc() != -1)
		{
			System.out.println("Insira o numero da conta: (digite -1 para sair)");
			client.setAcc(input.nextInt());
			System.out.println("Qual o saldo atual do cliente? (digite -1 para sair)");
			client.setBalance(input.nextInt());
			System.out.println("Limite de credito autorizado? (digite -1 para sair)");
			client.setauthorizedCredit(input.nextInt());
			
			if(client.getAcc() != -1) 
			System.out.printf("Acc:%d%nBalance:%d%nCredito:%d%n",
					client.getAcc(), client.getBalance(), client.getAuthorizedCredit());
		
		
		}
	}
}

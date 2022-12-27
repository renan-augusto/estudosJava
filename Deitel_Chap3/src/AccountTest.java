
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//cria um objeto ACcount e o atribui a myAccount
		Account myAccount = new Account();
		
		//exibe o valor inicial do nome (null)
		
		System.out.printf("Nome incial: %s%n%n", myAccount.getName());
		
		//solicita e lê o nome
		System.out.println("Por favor entre com o nome: ");
		String theName = input.nextLine();//lê uma linha de texto
		myAccount.setName(theName); // insere theName em myAccount
		System.out.println();
		
		//exibe o nome armazenado no objeto myAccount
		System.out.printf("O nome no objeto myAccount: %n%s%n", myAccount.getName());
		

	}

}

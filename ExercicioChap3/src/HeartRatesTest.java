//TODO utlizar os metodos get e set

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HeartRates person1 = new HeartRates("name", "lastName", 0, 0, 0);
		
		System.out.print("Entre com o seu primeiro nome: ");
		person1.setName(input.next());
		System.out.print("Entre com o seu sobrenome: ");
		person1.setLastName(input.next());
	    System.out.print("Entre com o seu dia de nascimento: ");
	    person1.setBirthDay(input.nextInt());
	    System.out.print("Entre com o seu mes de nascimento: ");
	    person1.setBirthMonth(input.nextInt());
	    System.out.print("Entre com o seu ano de nascimento: ");
	    person1.setBirthYear(input.nextInt());
	    
		person1.displayCardiacInfo(person1.getBirthYear());
		
	    }
}
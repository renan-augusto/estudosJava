import java.util.Scanner;

public class MyTestApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MyTestClass renan = new MyTestClass("name", "lastName");
		
		System.out.print("Insira o nome: ");
		renan.setName(input.next());
		System.out.print("Insira o sobrenome: ");
		renan.setLastName(input.next());
		
		
		renan.displayMyClass();
		
		
		
		

	}

}

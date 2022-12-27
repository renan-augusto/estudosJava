//TODO grafico de valores do IMC 

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HealthProfile renan = new HealthProfile("name","lastName", "gender", 0, 0, 0, 0.00 , 0);
		
		
		System.out.print("Entre com o seu primeiro nome: ");
		renan.setName(input.next());
		System.out.print("Entre com o seu sobrenome: ");
		renan.setLastName(input.next());
		System.out.print("Entre com o seu sexo: ");
		renan.setGender(input.next());
		System.out.print("Entre com o seu dia de nascimento: ");
		renan.setBirthDay(input.nextInt());
		System.out.print("Entre com o seu mes de nascimento: ");
		renan.setBirthMonth(input.nextInt());
		System.out.print("Entre com o seu ano de nascimento: ");
		renan.setBirthYear(input.nextInt());
		System.out.print("Entre com a sua altura em metros: ");
		renan.setHeight(input.nextDouble());
		System.out.print("Entre com o seu peso: ");
		renan.setWeight(input.nextDouble());

		renan.displayHealthProfile(renan.getBirthYear());
		renan.displayImc(renan.getHeight(), renan.getWeight());
		System.out.printf("%nGrafico do imc:%nAbaixo do peso: menos que 18,5%nNormal: entre 18,5 e 24,9%nSobrepeso: entre 25 e 29,9%nObesidade: 30 ou mais");
			
	}

}

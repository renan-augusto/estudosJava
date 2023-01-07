//Escreva um aplicativo que calcule o produto dos numeros inteiros impares de 1 a 15

public class Exercicio5_12 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 15; i += 2)
			for(int j = 1; j <= 15; j +=2)
			System.out.println(i*j);
	}

}

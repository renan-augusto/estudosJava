//escreva um aplicativo que calcule o fatorial de 1 a 20
//utilize o tipo long
//exiba os resultados em formato tabular
//fatorial eh quando vc vai multiplicando o numero pelos seus antecessores
// exemplo 4! = 4*3*2*1 
public class Exercicio5_13 {

	public static void main(String[] args) {
//		long fat = 1;
		for(long i = 1; i <= 20; i++) {
			long fat = 1;
			
			for (long j = i; j > 1; j--)
				fat *= j;
			
			System.out.printf("%d! = %d%n", i, fat);
		}
				
//			fat *= i;
//		System.out.println(fat);			
			

	}

}

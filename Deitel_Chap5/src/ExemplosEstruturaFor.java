
public class ExemplosEstruturaFor {

	public static void main(String[] args) {
		// Varie a variavel de controle de 1 a 100 em incrementos de 1.
		for(int i = 1; i <= 100; i++)
			System.out.printf("%d ", i);
			System.out.println("");
		//varie a variavel de controle d 100 a 1 em decrementos de 1.
		for(int i = 100; i >= 1; i--)
			System.out.printf("%d ", i);
			System.out.println(" ");
		//varie a variavel de controle de 7 a 77 em incrementos de 7.
		for(int i = 7; i <= 77; i += 7)
			System.out.printf("%d ", i);
			System.out.println(" ");
		//varie a variavel de controle de 20 a 2 em decrementos de 2.
		for(int i = 20; i >= 2; i -= 2)
			System.out.printf("%d ", i);	
			System.out.println(" ");
		//varie a variavel de controle em relacao aos valores 2,5,8,11,14,17,20
		for(int i = 2; i <=20; i += 3)
			System.out.printf("%d ", i);
			System.out.println(" ");
		//varie a variavel de controle em relacao aos valores 99,88,77,66,55,44,33,22,11,0
		for(int i = 99; i >= 0; i -= 11)
			System.out.printf("%d ", i);
			System.out.println(" ");			

	}

}

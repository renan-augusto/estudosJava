import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double rad;
		
		System.out.println("Entre com o raio (em inteiro) de sua circunferencia: ");
		rad = input.nextDouble();
		
		System.out.printf("Diametro: %f\n", 2*rad);
		System.out.printf("Circunferencia: %f\n", 2*Math.PI*rad);
		System.out.printf("Area: %f\n", Math.PI*(rad*rad));
		
	}

}

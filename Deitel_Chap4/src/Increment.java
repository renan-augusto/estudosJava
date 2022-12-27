
public class Increment {

	public static void main(String[] args) {
		int c = 5;
		System.out.printf("C antes do pos incremento: %d%n", c);
		System.out.printf("  pos incrementando c: %d%n ", c++);
		System.out.printf(" c depois do pos incremento: %d%n", c);
		
		System.out.println();
		
		c = 5;
		
		System.out.printf(" c antes do pre incremento: %d%n", c);
		System.out.printf("  pre incrementando c: %d%n", ++c);
		System.out.printf(" c depoiss do pre incremento: %d%n", c);
		
	}

}

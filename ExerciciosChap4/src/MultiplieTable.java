
public class MultiplieTable {

	public static void main(String[] args) {
		int counter = 1;
//		int firstMultiplier = 1;
//		int secondMultiplier = 1;
//		int thirdMultiplier = 1;
		System.out.println("N 10*N 100*N 1000*N");
		
		while(counter < 6)
		{
//			firstMultiplier *= 10;
//			secondMultiplier *= 100;
//			thirdMultiplier *= 1000;
			
			System.out.printf("%d %d   %d   %d%n",counter, counter * 10, counter * 100, counter * 1000);
			
			
			counter++;
		}

	}

}

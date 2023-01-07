//modificar o programa Intereset. java para que:
//tambem calcule as seguintes taxas de juros: 5,6,7,8,9,10
public class Exercicio5_14 {

	public static void main(String[] args) {
		double amount = 0;
		double principal = 1000.0;
		
		System.out.printf("%s%30s %n", "Year", "Amount on deposit");
		
		for(int rate = 5; rate <= 10; rate ++)
		{
			System.out.printf("Taxa de juros %d%%\n", rate);
			for(int year = 1; year <=10; ++year)
			{
				amount = principal * Math.pow(1.0 + rate, year);
				System.out.printf("%4d%, 30.2f%n", 
						year, amount);
				
			}
		}

	}

}

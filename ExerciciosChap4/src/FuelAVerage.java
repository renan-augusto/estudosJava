import java.util.Scanner;

public class FuelAVerage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int fuelSum = 0;
		int kmSum = 0;
		
		System.out.print("Entre com a quilometragem viajada ou tecle -1 para sair: ");
		int traveledKm = input.nextInt();
		System.out.print("Entre com o consumo ou repita -1 para sair: ");
		int consumption = input.nextInt();
		
		while(traveledKm != -1 && consumption != -1)	
		{
			kmSum += traveledKm;
			fuelSum += consumption;
			counter += 1;
			
			System.out.printf("%nMedia da ultima viagem inserida: %.2f", (double) traveledKm/consumption);
			
			System.out.printf("%nEntre com a quilometragem viajada ou tecle -1 para sair: ");
			traveledKm = input.nextInt();
			System.out.printf("%nEntre com o consumo ou repita -1 para sair: ");
			consumption = input.nextInt();			
			
		}
		
		if(traveledKm != 0)
		{
			System.out.printf("Total de viagens inseridas: %d%nTotal de consumo: %d%nTotal da distancia percorrida: %d%n", counter, fuelSum, kmSum);
		}
		else
			System.out.println("Lancamentos com valores zerados detectados");
		

	}

}

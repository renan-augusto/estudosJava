
public class SalesCalculator {
	int productN;
	int qtd;
	double total;
	
	public void addProduct(int productN, int qtd) {
		switch (productN) {
		case 1:
			total += 2.98 * qtd;
			break;
		case 2:
			total += 4.50 * qtd;
			break;
		case 3:
			total += 9.98 * qtd;
			break;
		case 4:
			total += 4.49 * qtd;
			break;
		case 5:
			total += 6.87 * qtd;
			break;
		default:
			break;
		}
	
	}
	
	public double getTotal() {
		return total;
	}
}

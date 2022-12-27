import javax.swing.JOptionPane;
import java.lang.*;

public class Exercicio1 {

	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog("Entre com o primeiro numero: ");
		String number2 = JOptionPane.showInputDialog("Entre com o segundo numero: ");
		
		int number1I = Integer.parseInt(number1);
		int number2I = Integer.parseInt(number2);
		
		int sum = number1I + number2I;
		
		
		String message = 
				String.format("O resultado %i", sum);
		
		JOptionPane.showMessageDialog(null, message);

	}

}

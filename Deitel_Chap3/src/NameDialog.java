import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("Qual o seu nome?");
		
		String message = 
				String.format("Bem-vindo, %s, a programacao com Java", name);
		
		JOptionPane.showMessageDialog(null,message);

	}

}

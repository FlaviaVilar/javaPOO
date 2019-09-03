import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		boolean tudoOk = false;
		double numero = 0;

		do {
			try {
				numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero:"));
				if (numero < 0)
					throw new NumberFormatException();
				tudoOk = true;
			} catch (NumberFormatException e) {
				tudoOk = false;
				JOptionPane.showMessageDialog(null, "Valor inv�lido");
			} catch (NullPointerException e) {
				System.exit(0);
			}
		} while (tudoOk == false);


		int numeroInteiro = (int)numero;
		boolean numeroEInteiro = (numero - numeroInteiro) ==0;

		if(numeroEInteiro) {
			JOptionPane.showMessageDialog(null, "� inteiro");
		}
		else {
			JOptionPane.showMessageDialog(null, "N�o � inteiro");
		}
	}
}

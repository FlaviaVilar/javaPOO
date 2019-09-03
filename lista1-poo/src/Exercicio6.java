import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		boolean tudoOk = false;
		double numero = 0;

		do {
			try {
				numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
				if (numero < 0)
					throw new NumberFormatException();
				tudoOk = true;
			} catch (NumberFormatException e) {
				tudoOk = false;
				JOptionPane.showMessageDialog(null, "Valor inválido");
			} catch (NullPointerException e) {
				System.exit(0);
			}
		} while (tudoOk == false);


		int numeroInteiro = (int)numero;
		boolean numeroEInteiro = (numero - numeroInteiro) ==0;

		if(numeroEInteiro) {
			JOptionPane.showMessageDialog(null, "É inteiro");
		}
		else {
			JOptionPane.showMessageDialog(null, "Não é inteiro");
		}
	}
}

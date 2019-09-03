import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {

		double valorTotal = 0;
		double valor = 0;		
		boolean continuaCaptura = true;

		do {
			try {
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:" + " - Subtotal: R$" +valorTotal));
				if (valor < 0){
					continuaCaptura = false;
					break;
				}
				valorTotal += valor;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			} catch (NullPointerException e) {
				System.exit(0);
			}
		} while (continuaCaptura);

		JOptionPane.showMessageDialog(null, "Valor total: R$" +valorTotal);

	}
}


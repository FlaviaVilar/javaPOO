import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		boolean tudoOk = false;
		double altura = 0;
		double total = 0;
		
		do {
			try {String alt = JOptionPane.showInputDialog("Digite sua altura ");
				altura = Double.parseDouble(alt);
				if(altura <= 0) {
					throw new NumberFormatException();
				}
				tudoOk = true;
			}
			catch(NumberFormatException erro) {
				tudoOk = false;
				JOptionPane.showMessageDialog(null, "Digite um número válido");
			}
			catch(NullPointerException erro) {
				System.exit(0);
			}
			
		}
		while(tudoOk == false);
		
		
		 total = (72.7* altura)-58;
		
		JOptionPane.showMessageDialog(null, "Peso ideal = " +total);
		

	}

}

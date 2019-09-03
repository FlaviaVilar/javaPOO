import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		
		String[] numero = {""};
		boolean capturaOk = false;
		
		do {
			try {
				numero[0] = (JOptionPane.showInputDialog("Digite um número de 0 à 9"));
				int numeroEmInt = Integer.parseInt(numero[0]);
				if (numeroEmInt < 0 || numeroEmInt > 9){
					throw new NumberFormatException();
				}
				capturaOk = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
				capturaOk = false;
			} catch (NullPointerException e) {
				System.exit(0);
			}
		}while (capturaOk == false);
			
			
		Exercicio9Compl.main(numero);
	}


	}



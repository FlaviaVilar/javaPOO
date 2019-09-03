import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		boolean tudoOk = false;
		double salHora = 0;
		double horasTrabalhadas = 0;
		
		do {
			try {
				String v1 = JOptionPane.showInputDialog("Quanto você ganha por hora? ");
				 salHora = Double.parseDouble(v1);
				 if(salHora <= 0) {
					 throw new NumberFormatException(); 
				 }
				 tudoOk = true;
			}
				 catch(NumberFormatException erro) {
					 tudoOk = false;
					 JOptionPane.showMessageDialog(null, "Digite um numero válido");
					 
				 }
			catch(NullPointerException erro) {
				System.exit(0);
			}
			
		}
		while(tudoOk == false);
		
		do {
			try {
				String v2 = JOptionPane.showInputDialog("Numero de horas trabalhadas no mês: ");
				 horasTrabalhadas = Double.parseDouble(v2);
				 if(horasTrabalhadas <= 0) {
					 throw new NumberFormatException(); 
				 }
				 tudoOk = true;
			}
				 catch(NumberFormatException erro) {
					 tudoOk = false;
					 JOptionPane.showMessageDialog(null, "Digite um numero válido");
					 
				 }
			catch(NullPointerException erro) {
				System.exit(0);
			}
			
		}
		while(tudoOk == false);
		
		
		

		double total = salHora*horasTrabalhadas;
		JOptionPane.showMessageDialog(null, "Seu salário: " + total);
	}

}

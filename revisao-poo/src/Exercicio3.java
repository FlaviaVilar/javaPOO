import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		double n1 = 0,n2 = 0,total = 0;
		boolean tudoOk = false;

			do {
				try {
					String a = JOptionPane.showInputDialog("Entre com o primeiro numero: ");
					n1 = Integer.parseInt(a);
					String b = JOptionPane.showInputDialog("Entre com o segundo numero: ");
					n2 = Integer.parseInt(b);
					tudoOk = true;
					if(n2 <= 0) {
						throw new NumberFormatException();
					}
						total = n1/n2;
						JOptionPane.showMessageDialog(null, "Total = " + total);
					
					}
				
				catch(ArithmeticException e) {
					JOptionPane.showMessageDialog(null, "Digite numero válido");
					tudoOk = false;
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite numero válido");
					tudoOk = false;
				}
			}
				while (tudoOk = false);


			
		
		
	}

}

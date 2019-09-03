import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		boolean tudoOk = false;
		double x =0;
		double y =0;

		do {
			try {
				String v1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
				x = Double.parseDouble(v1);
				tudoOk = true;
			}
			catch(NumberFormatException erro){
				tudoOk = false;
				JOptionPane.showMessageDialog(null,"Digite um numero válido");
			} catch (NullPointerException e) {
				System.exit(0);
			}

		}
		while (tudoOk == false);

		do {
			try {
				String v2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
				y = Double.parseDouble(v2);
				tudoOk = true;

			}catch(NumberFormatException erro) {
				tudoOk = false;
				JOptionPane.showMessageDialog(null,"Digite numero válido" );			
			} catch (NullPointerException e) {
				System.exit(0);
			}
		}
		while(tudoOk == false);



		double adicao = x+y;
		double subtracao = x-y;
		double multiplicacao = x*y;
		double divisao = x/y;

		JOptionPane.showMessageDialog(null, "Resultados: " + 
				"\nSoma = " + adicao  +
				"\nSubtração = " + subtracao  +
				"\nMultiplicação = " + multiplicacao  +
				"\nDivisão = " + divisao);


	}

}



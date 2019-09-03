import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		boolean tudoOk = false;
		double valorIptu = 0;


		do {
			try {
				String vIptu = JOptionPane.showInputDialog("Digite o valor do IPTU: ");
				valorIptu = Double.parseDouble(vIptu);

				if(valorIptu < 0) {
					throw new NumberFormatException();
				}
				tudoOk = true;
			}
			catch(NumberFormatException erro) {
				tudoOk = false;
				JOptionPane.showMessageDialog(null, "Digite um numero válido");
			}
		}
		while(tudoOk = false);
	



	double desconto = (valorIptu * 0.05);
	double totalDesconto = valorIptu - desconto;
	
	
	JOptionPane.showMessageDialog(null,"Valor do Iptu = " + valorIptu + "\n" + "Valor com desconto = " + totalDesconto);
	}

}

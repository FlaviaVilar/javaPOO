import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		int numero = 0;
		boolean capturaOk = false;

		do {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 à 12:"));
				if (numero < 1 || numero > 12){
					throw new NumberFormatException();
				}
				capturaOk = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite números de 1 à 12");
				capturaOk = false;
			} catch (NullPointerException e) {
				System.exit(0);
			}
		}while (capturaOk == false);

		String mes = "Valor inválido";

		switch (numero) {
		case 1:
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;

		default:
			mes = "Valor Inválido";
			break;
		}

		JOptionPane.showMessageDialog(null, "O mês é " + mes);


	}
}

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		int numero = 0;
		boolean capturaOk = false;

		do {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 1 � 12:"));
				if (numero < 1 || numero > 12){
					throw new NumberFormatException();
				}
				capturaOk = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite n�meros de 1 � 12");
				capturaOk = false;
			} catch (NullPointerException e) {
				System.exit(0);
			}
		}while (capturaOk == false);

		String mes = "Valor inv�lido";

		switch (numero) {
		case 1:
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Mar�o";
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
			mes = "Valor Inv�lido";
			break;
		}

		JOptionPane.showMessageDialog(null, "O m�s � " + mes);


	}
}

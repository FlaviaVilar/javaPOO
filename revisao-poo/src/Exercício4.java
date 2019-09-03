import javax.swing.JOptionPane;

public class Exercício4 {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("Entre com o nome: ");

		char[] nome = a.toCharArray();

		if(nome.length == 0) {
			JOptionPane.showMessageDialog(null, "Digite alguma coisa rs");

		}
		else {
			for(int i = 0 ; i < a.length() ; i++) {
				JOptionPane.showMessageDialog(null, nome[i] + "\n" );
				System.out.println(nome[i] + "\n");
			}




		}
	}
}

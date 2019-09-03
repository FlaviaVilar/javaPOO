import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 0;
		int soma = 0;
		int count = 0;

		String a = JOptionPane.showInputDialog("Entre com o primeiro numero: ");
		String b = JOptionPane.showInputDialog("Entre com o segundo numero: ");


		n1 = Integer.parseInt(a);
		n2 = Integer.parseInt(b);

		if(n1 > n2) {

			for(int i = n2; i <= n1; i++) {
				soma = soma + i;
				System.out.println("A soma: " + soma);
			}
			System.out.println("--------------------");
			for(int i = n2; i <= n1; i++) {
				if(i%2 != 0) {
					i++;
					System.out.println(i);

				}
				
			}
			System.out.println("--------------------");
			for(int i = n2; i <= n1; i++) {
				System.out.println(i);
			}
		}



	}
}


import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
float nota1 = 0;
		
		do {
			try {
				String s = (JOptionPane.showInputDialog("Digite a nota 1:"));
				if(s == null){
					JOptionPane.showMessageDialog(null, "Cancelar pressionado");
					System.exit(0);
				}
				nota1 = Float.parseFloat(s);
					
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite uma nota de 0 a 10");
				nota1 = -1;
			}
			
		} 
		while (nota1 < 0 || nota1 > 10);
		
		float nota2 = 0;
		
		do {
			try {
				String s = (JOptionPane.showInputDialog("Digite a nota 2:"));
				if(s == null){
					JOptionPane.showMessageDialog(null, "Cancelar pressionado");
					System.exit(0);
				}
				nota2 = Float.parseFloat(s);
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite uma nota de 0 a 10");
				nota2 = -1;
			}
			
		} while (nota2 < 0 || nota2 >10);
		
		System.out.println("Média = " + (nota1 + nota2) / 2);
	}

}

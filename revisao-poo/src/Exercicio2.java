import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
		String a = JOptionPane.showInputDialog("Numero?");
		
		if(a.equals("1")){
			System.out.println("Um");
		}
		else if(a.equals("2")){
			System.out.println("Dois");
		}
		else if(a.equals("3")){
			System.out.println("Três");
		}
		else{
			System.out.println("Desconhecidos");
		}
	}
			
			
			
			


	}
}

import javax.swing.JOptionPane;

public class Ex1Samuel {
	
	public static void main(String[] args) {
	
		double x = 0;
		double y = 0;
		boolean Cleiton = false;
		
		do {
			try {
				String Sheila = JOptionPane.showInputDialog("Digite o primeiro número: ");
				x = Double.parseDouble(Sheila);
				
			}catch(NumberFormatException e){
				
			}
			
		}
		while(Cleiton == false);
				
		
	}

}

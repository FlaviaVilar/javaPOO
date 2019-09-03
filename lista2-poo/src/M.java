import java.util.Random;

import javax.swing.JOptionPane;

public class M {


	public static String converter (int n ) {
		if(n < 1 || n > 7) {
			return "Digite numero válido";
		}else {

			String[] dias =  {"Domingo" , "Segunda" , "Terça" , "Quarta" , "Quinta" , "Sexta" , "Sábado"};
			return dias[n-1];
		}
			
	}
	
	public static String gerar (int n) {
		Random rd = new Random();
		String a = " ";
		
		for(int i = 0; i < n; i++ ) {
			JOptionPane.showMessageDialog(null, rd.nextInt(1000)+ "");
		}
		return a.toString();
		
	}
	
	
	public static int comparar(int n1, int n2, int n3) {
		int maior = 0;
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}
		else if(n2 > n1 && n2 > n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		return maior;
	}
	
	public static void contar(int inicio, int fim) {
		
		System.out.println("Decrescente: ");
		if(inicio<fim) {
			for(int i = fim; i >= inicio; i--) {
				System.out.print(i + ", ");
			}
		} else if (inicio>fim) {
			for(int i = inicio; i >=fim; i--) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("\n");
	
		
	}
	
	public static String gerarSenha(int n) {
		
		Random rd = new Random();
		String numeros = "1234567890";
		String a = " ";
		
		for (int i = 0; i < n; i++) {
			 // System.out.print(numeros.charAt(rd.nextInt(numeros.length())));
			  JOptionPane.showMessageDialog(null, numeros.charAt(rd.nextInt(numeros.length())));
		}
		return a.toString();
		
			
	}
	
	public static String alocar(int n) {
		
		return Integer.toString(n % 45 == 0 ? (n / 45) : (n / 45 + 1));
		
	}
	
}





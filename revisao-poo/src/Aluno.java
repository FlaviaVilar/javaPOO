
public class Aluno {
	
	private double nota1;
	private double nota2;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if(nota1 > 0 && nota1 < 10) {
			this.nota1 = nota1;
		}
		else {
			System.out.println("Valor inválido");
		}
		
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		if(nota2 > 0 && nota2 < 10) {
			this.nota2 = nota2;
		}
		else {
			System.out.println("Valor inválido");
		}
	}
	
	public void getMedia() {
	System.out.println((nota1+nota2)/2);
	
	}

}


public class Estudante extends Pessoa {
	
	private int anoEscolar;
	
	public void mostraDadosEstudante() {
		System.out.println("Ano escolar: " + anoEscolar + "\n" + "-----------------");
	}
	
	public void setAnoEscolar(int anoEscolar) {
		this.anoEscolar = anoEscolar;
	}
	
	public int getAnoEscolar() {
		return anoEscolar;
	}
	
	public void matricular() {
		System.out.println("Matriculado");
	}
	
	public void estudar() {
		System.out.println("Estudando...");
	}

}

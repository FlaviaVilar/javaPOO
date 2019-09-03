
public class Lampada {
	
	private String estado = "apagada";
	
	
	public void acende() {
		this.estado = "Acendeu!!";
	}
	
	public void apaga() {
		this.estado = "Apagou!!";
	}
	
	public void meiaLuz() {
		this.estado = "Meia Luz!!";
	}
	
	public void mostraEstado() {
		System.out.println(estado);
	}

	public static void main(String[] args) {
		Lampada l = new Lampada();
		
		l.meiaLuz();
		l.mostraEstado();
	}
}

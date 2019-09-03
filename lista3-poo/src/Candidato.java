
public class Candidato extends Pessoa {
	
	private int numero;
	private Partido partido;
	private String cargo;
	public int getNumero() {
		return numero;
	}
	
	
	public void mostrarDados() {
		super.mostrarNome();
		System.out.println(numero+"\n"+partido.getNome() + "\n"+cargo+"\n"+
				"----------------------------"+"\n");
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPartido() {
		return partido.getNome();
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return getPartido();
	}
	

}

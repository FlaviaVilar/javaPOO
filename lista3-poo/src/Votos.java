
public class Votos extends Pessoa{
	
	private int numero;
	private Candidato deputadoFederal;
	private Candidato deputadoEstadual;
	private Candidato senador01;
	private Candidato senador02;
	private Candidato governador;
	private Candidato presidente;
	
	public void mostrarDados() {
		deputadoFederal.mostrarDados();
		deputadoEstadual.mostrarDados();
		senador01.mostrarDados();
		senador02.mostrarDados();
		governador.mostrarDados();
		presidente.mostrarDados();
	}	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDeputadoFederal() {
		return deputadoFederal.getNome();
	}
	public void setDeputadoFederal(Candidato deputadoFederal) {
		this.deputadoFederal = deputadoFederal;
	}
	public String getDeputadoEstadual() {
		return deputadoEstadual.getNome();
				
	}
	public void setDeputadoEstadual(Candidato deputadoEstadual) {
		this.deputadoEstadual = deputadoEstadual;
	}
	public String getSenador01() {
		return senador01.getNome();
	}
	public void setSenador01(Candidato senador01) {
		this.senador01 = senador01;
	}
	public String getSenador02() {
		return senador02.getNome();
	}
	public void setSenador02(Candidato senador02) {
		this.senador02 = senador02;
	}
	public String getGovernador() {
		return governador.getNome();
	}
	public void setGovernador(Candidato governador) {
		this.governador = governador;
	}
	public String getPresidente() {
		return presidente.getNome();
	}
	public void setPresidente(Candidato presidente) {
		this.presidente = presidente;
	}
	
	

}

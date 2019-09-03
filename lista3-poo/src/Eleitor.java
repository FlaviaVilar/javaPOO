import javax.print.attribute.standard.PrinterLocation;

public class Eleitor extends Pessoa {
	
	public void mostrarDados() {
		super.mostrarNome();
		System.out.println(numeroTitulo+"\n"+zonaEleitoral+"\n"+
				"----------------------------"+"\n");
	}
	
	private int numeroTitulo;
	private int zonaEleitoral;
	
	public int getNumeroTitulo() {
		return numeroTitulo;
	}
	public void setNumeroTitulo(int numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}
	public int getZonaEleitoral() {
		return zonaEleitoral;
	}
	public void setZonaEleitoral(int zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}
	
	public void votar(Eleitor e, Votos votos) {
	System.out.println("Nome eleitor: " + e.getNome() + "\n"
			+ "Numero do título: " + e.getNumeroTitulo() + "\n"
			+ "Deputado Estadual: " + votos.getDeputadoEstadual()+ "\n"
			+ "Deputado Federal: " + votos.getDeputadoFederal() + "\n" 
			+ "Governador: " + votos.getGovernador() + "\n"
			+ "Senador1: " + votos.getSenador01() + "\n"
			+ "Senador2: " + votos.getSenador02() + "\n"
			+ "Presidente: " + votos.getPresidente() + "\n");
	}
	
	

}

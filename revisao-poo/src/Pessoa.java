
public class Pessoa {

	private String nome;
	private String endereco;
	
	public void mostraDadosPessoa() {
		System.out.println("Nome: " + nome + "\n" + "Endereço: " + endereco + "\n" + "-----------------");
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void comer() {
		System.out.println("Comendo...");
	}
	
	public void dormir() {
		System.out.println("Dormindo...");
	}
}

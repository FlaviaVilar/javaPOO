
public class Exercicio6 {
	
	private String nome;
	private int codigo;
	private double preco;
	
	Exercicio6() {
		System.out.println("Descrição do produto: ");
	}
	
	public void MostraDados() {
		System.out.println(nome + "\n" + codigo + "\n" + preco + "\n" +  "--------------------------");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	

}

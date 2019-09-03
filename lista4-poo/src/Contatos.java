
public class Contatos {
	
	public Contatos() {
		
	}

	private int ddd;
	private int numero;
	private String nome;
	
	public Contatos(int ddd, int numero, String nome) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.nome = nome;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void mostrar() {
		System.out.println(numero);	
		System.out.println(ddd);	
		System.out.println(nome);	
	}
}

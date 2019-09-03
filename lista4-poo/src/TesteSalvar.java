
public class TesteSalvar {
	
public static void main(String[] args) {
		
		Contatos p = new Contatos(19, 13333445, "Flavia Vilar");
		ContatosDAO dao = new ContatosDAO();
		System.out.println(dao.salvar(p));
	}

}

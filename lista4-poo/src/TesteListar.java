import javax.swing.JOptionPane;

public class TesteListar {

	public static void main(String[] args) {
		ContatosDAO dao = new  ContatosDAO();
		//System.out.println(dao.popular());   usado para popular bd
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
		Contatos p = dao.localizar(cod);
		if(p!=null) {
			p.mostrar();
		}
		dao.listar();
		
}}

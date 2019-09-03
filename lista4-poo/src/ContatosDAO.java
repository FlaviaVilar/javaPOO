import java.sql.SQLException;


public class ContatosDAO {

	public Contatos contatos = new Contatos();
	public BD bd = new BD();
	private String sql, ret; // vari�veis internas
	
	
	
	public String salvar(Contatos c) {

			sql = "insert into contatos values (?,?,?)";
			try {
				bd.getConnection();
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, c.getNumero()); // 1 � pelo primeiro ?, primeiro par�metro.
				bd.st.setInt(2, c.getDdd());
				bd.st.setString(3, c.getNome());
				bd.st.executeUpdate();
				ret = "Sucesso na inclus�o";
			}
			catch(SQLException erro) {

				sql = "update contatos set ddd=?, nome=?, where numero=? ";

				try {
					bd.getConnection();
					bd.st = bd.con.prepareStatement(sql);
					bd.st.setInt(3, c.getNumero()); 
					bd.st.setInt(1, c.getDdd());
					bd.st.setString(2, c.getNome());
					bd.st.executeUpdate();
					ret = "Sucesso na altera��o";
				}
				catch(SQLException e) {
					ret = "Falha " + e.toString();
				}


			}
			finally

			{
				bd.close();
			}
			return ret;
		}
	
	
	public String excluir(int codigo) {

		sql = "delete from contatos where numero=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codigo);
			int n = bd.st.executeUpdate();
			if(n==1) { System.out.println(ret = "Exclus�o realizada");}
			
			else { System.out.println(ret =  "C�digo n�o localizado"); }
		}
		catch(SQLException erro) {
			ret = "Falha " + erro.toString();

		}
		finally {
			bd.close();
		}
		return ret;
	}
	
	
	public Contatos localizar(int numero) {
		sql = "select * from contatos where numero = ?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, numero);
			bd.rs = bd.st.executeQuery();  // query tem q ser guardado no resul set
			if(bd.rs.next()) {
				contatos.setNumero(bd.rs.getInt(1));
				contatos.setDdd(bd.rs.getInt(2));
				contatos.setNome(bd.rs.getString(3));
				return contatos;

			}
			else {
				return null;
			}
		}
		catch(SQLException erro) {
			return null;

		}
		finally {
			bd.close();
		}
	}

	public void listar() {
		sql = "select * from contatos";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) {
				System.out.println("["+bd.rs.getInt(1)+","
						+bd.rs.getInt(2)+","
						+bd.rs.getString(3)+","+"]");
			}
		}
		catch(Exception e) {
			System.out.println( e.toString());
		}
		finally {
			bd.close();
		}
	}
		
		
		
		
		
		
	}


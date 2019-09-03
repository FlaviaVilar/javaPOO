
public class Urna {

	public static void main(String[] args) {
		
		Partido p1 = new Partido();
		p1.setCodigo(1);
		p1.setSigla("AAA");
		p1.setNome("Partidão");
		
		Partido p2 = new Partido();
		p1.setCodigo(2);
		p1.setSigla("BBB");
		p1.setNome("Partidinho");
		
		Partido p3 = new Partido();
		p1.setCodigo(3);
		p1.setSigla("CC");
		p1.setNome("PowerPartido");
		
		//------------------------------------//
		
		Candidato c1 = new Candidato();
		c1.setCargo("Presidente");
		c1.setNumero(12);
		c1.setPartido(p1);
		c1.setNome("Ciro");
		
		Candidato c2 = new Candidato();
		c2.setCargo("Deputado Federal");
		c2.setNumero(1200);
		c2.setPartido(p1);
		c2.setNome("Macarrão");
		
		Candidato c3 = new Candidato();
		c3.setCargo("Deputado estadual");
		c3.setNumero(12100);
		c3.setPartido(p1);
		c3.setNome("Picles");
		
		Candidato c4 = new Candidato();
		c4.setCargo("Senador");
		c4.setNumero(121);
		c4.setPartido(p1);
		c4.setNome("Gema");
		
		Candidato c5 = new Candidato();
		c5.setCargo("Senador");
		c5.setNumero(122);
		c5.setPartido(p1);
		c5.setNome("Clara");
		
		Candidato c6 = new Candidato();
		c6.setCargo("Governador");
		c6.setNumero(21);
		c6.setPartido(p1);
		c6.setNome("Brócolis");
		
		//-------------------------------------//
		
		Eleitor e = new Eleitor();
		e.setNome("Rogerinho");
		e.setNumeroTitulo(12345);
		e.setZonaEleitoral(210);
		
		//------------------------------------//
		
		Votos v = new Votos();
		
		v.setPresidente(c1);
		v.setDeputadoFederal(c2);
		v.setDeputadoEstadual(c3);
		v.setSenador01(c4);
		v.setSenador02(c5);
		v.setGovernador(c6);
		
		
		System.out.println("Dados do eleitor:\n");
		e.mostrarDados();
		System.out.println("Votos:\n");
		v.mostrarDados();
		
		
		
		
		
		

	}

}

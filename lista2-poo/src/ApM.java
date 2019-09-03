import javax.swing.JOptionPane;

public class ApM {

	public static void main(String[] args) {

		//Escolher opção
		String opcao = "";

		try {
			opcao = JOptionPane.showInputDialog("1 - Testar método converter\n" + "2 - Testar método gerar\n"
					+ "3 - Testar método comparar \n" + "4 - Testar método contar \n"
					+ "5 - Testar método gerarSenha\n" + "6 - Testar método alocar");
			if (opcao == null) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			System.exit(0);
		}

		//Método Converter

		if (opcao.equals("1")) {
			int diaSemana = 0;
			try {
				String diaSemanaString = JOptionPane.showInputDialog("Digite um valor de 1 à 7 (Domingo à Segunda):");
				if (diaSemanaString == null) {
					throw new NullPointerException();
				}

				diaSemana = Integer.parseInt(diaSemanaString);

			} catch (NumberFormatException e) {
				diaSemana = 0;
			} catch (NullPointerException e) {
				System.exit(0);
			}

			JOptionPane.showMessageDialog(null, "Dia da semana = " + M.converter(diaSemana));
		}


		//Método Gerar

		// teste metodo gerar

		if (opcao.equals("2")) {
			Integer numerosRandomicos = 0;
			try {
				String numerosRandomicosString = JOptionPane
						.showInputDialog("Digite a quantidade " + "desejada de números Randomicos:");
				if (numerosRandomicosString == null) {
					throw new NullPointerException();
				}
				numerosRandomicos = Integer.parseInt(numerosRandomicosString);
				JOptionPane.showMessageDialog(null, M.gerar(numerosRandomicos));

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor Inválido!");
			} catch (NullPointerException e) {
				System.exit(0);
			}

			// teste metodo comparar
			if (opcao.equals("3")) {
				Integer[] numerosInteiros = new Integer[3];
				for (int i = 0; i < numerosInteiros.length; i++) {
					try {
						String numerosInteirosString = JOptionPane
								.showInputDialog("Digite o número " + (i + 1) + " para comparação:");
						if (numerosInteirosString == null) {
							throw new NullPointerException();
						}
						numerosInteiros[i] = Integer.parseInt(numerosInteirosString);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor Inválido!");
						i--;
					} catch (NullPointerException e) {
						System.exit(0);
					}
				}

				JOptionPane.showMessageDialog(null,
						"O maior número é: " + M.comparar(numerosInteiros[0], numerosInteiros[1], numerosInteiros[2]));
			}

			//Método Contar
			if (opcao.equals("4")) {

				try {
					int inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
					int fim = Integer.parseInt(JOptionPane.showInputDialog("Informe outro numero"));
					M.contar(inicio,fim); 
					if(inicio <0) {
						throw new Exception();						
					}
					if(fim <0) {
						throw new Exception();						
					}
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Digite valor válido");

				}

			}
			//Metodo Gerar Senha
			if (opcao.equals("5")) {
				Integer numeroDigitosSenha = 0;
				try {
					String numeroDigitosSenhaString = JOptionPane
							.showInputDialog("Digite a quantidade de digitos da senha:");
					if (numeroDigitosSenhaString == null) {
						throw new NullPointerException();
					}
					numeroDigitosSenha = Integer.parseInt(numeroDigitosSenhaString);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor Inválido!");
				} catch (NullPointerException e) {
					System.exit(0);
				}

				JOptionPane.showMessageDialog(null, "Senha: \n" + M.gerarSenha(numeroDigitosSenha));
			}

			if (opcao.equals(null)) {
				System.exit(0);
			}



		}
		//metodo alocar

		if (opcao.equals("6")) {
			Integer numeroPassageiros = 0;
			try {
				String numeroPassageirosString = JOptionPane.showInputDialog("Digite a quantidade passageiros:");
				if (numeroPassageirosString == null) {
					throw new NullPointerException();
				}
				numeroPassageiros = Integer.parseInt(numeroPassageirosString);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor Inválido!");
			} catch (NullPointerException e) {
				System.exit(0);
			}

			JOptionPane.showMessageDialog(null, "Número de ônibus necessários:: \n" + M.alocar(numeroPassageiros));
		}

		if (opcao.equals(null)) {
			System.exit(0);

		}
	}
}







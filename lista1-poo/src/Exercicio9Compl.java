
public class Exercicio9Compl {

	public static void main(String[] args) {
		String imprimir;
		String[] numeros = {"Zero" , "Um" , "Dois" , "Tr�s", "Quatro" , "Cinco" , "Seis" , "Sete", "Oito", "Nove"};
		int indexArray;
		
		try {
			indexArray = Integer.parseInt(args[0].toString());
			if(indexArray > numeros.length)
				throw new Exception();
			imprimir = numeros[indexArray];
		} catch (Exception e) {
			imprimir = "Valor Inv�lido";
		}
		
		System.out.println(imprimir);
	}
}

package Aula10;

public class Excecao1 {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;

		try {
			novaFrase = frase.toUpperCase();// ele coloca todos os caracteres em maiusculo

		} catch (NullPointerException e)// captura possível EXCEÇÃO
		{
			// Tratamento da exceção
			System.out.println("\nA frase inicial está nula, para solucionar tal problema,"
					+ "foi lhe atribuído um valor default...");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nNova frase: " + novaFrase);
	}
}

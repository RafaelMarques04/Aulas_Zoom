package Aula4;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float[] media = new float[4];
		float n1, n2, n3, somaMedia = 0, mediaGeral = 0, maiorMedia = 0;
		int x;

		for (x = 0; x < 4; x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = ler.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = ler.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = ler.nextFloat();

			media[x] = (n1 + n2 + n3) / 3;// 8 5 6 9
			somaMedia += media[x];// somaMedia = somaMedia + media[x]

			if (maiorMedia < media[x]) {
				maiorMedia = media[x];// 9
			}
		}
		mediaGeral = somaMedia / 4;

		System.out.println("\nMédia geral: " + mediaGeral);
		System.out.println("\nMaior média: " + maiorMedia);

		for (x = 0; x < 4; x++) {

			System.out.println("\nMédia alune" + (x + 1) + " foi de: " + media[x]);

			ler.close();
		}

	}

}

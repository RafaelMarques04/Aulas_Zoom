package Aula3;

import java.util.Scanner;

public class LaçoRepetição2 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, contPar = 0, somaImpar = 0;

		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();// 0 4

		while (numero != 0) {

			if (numero % 2 == 0) {
				contPar++;// contPar = contPar + 1
			} else {
				somaImpar += numero;// somaImpar = somaImpar + numero
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();

		}

		System.out.println("\nQuantidade de números pares digitados: " + contPar);
		System.out.println("\nSomatório de números impares digitados: " + somaImpar);

		leia.close();

	}
}

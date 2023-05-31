package Aula1;

import java.util.Scanner;

public class Variaveis_e_Operadores {

	public static void main(String[] args) {
		
		String  nome = "Charles";
		int idade = 25,x=10;
		double altura = 1.72;
		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome participante: "+nome);
		System.out.println("Idade participante: "+idade+" anos");
		System.out.println("Altura participante: "+altura);
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMédia Aritmética: "+media);
		System.out.printf("\nMédia Aritmética: %.2f",media);
		
		nota1 = (float) Math.sqrt(nota2);
		nota2 = (float) Math.pow(nota3, 3);
		x = x % 2;
		/*
		 x = 10
		 x == 10
		 */
		
	}

}
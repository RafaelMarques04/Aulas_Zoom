package Aula3;

import java.util.Scanner;

public class LaçoRepetição1 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,media,somaMedia = 0,mediaGeral;
		int x;
		
		for(x=1;x<=4;x++) { // x++ é a mesma coisa que x = x + 1
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia do alune %d foi de: %.2f",x,media);
			System.out.println("\nMédia do alune "+x+" foi de: "+media);//9 7 5 4
			
			somaMedia += media;//somaMedia = somaMedia + media
		}
		mediaGeral = somaMedia / (x-1);
		
		System.out.printf("\nMédia geral foi de: %.2f",mediaGeral);
		
		leia.close();

	}

}

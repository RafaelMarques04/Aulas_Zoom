package Aula7;

public class ProgramaçãoObjeto4 {

	public static void main(String[] args) {

		ProgramaçãoObjeto3[] lista = new ProgramaçãoObjeto3[3];

		lista[0] = new ProgramaçãoObjeto3("Vinicius Almeida", 8000);
		lista[1] = new ProgramaçãoObjeto3("Caique Ramos", 8500);
		lista[2] = new ProgramaçãoObjeto3("Thayna", 15000);

		for (ProgramaçãoObjeto3 roda : lista) {

			roda.imprimir();
		}

		System.out.println("\n**************************************************");

		for (ProgramaçãoObjeto3 roda : lista) {

			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}
}
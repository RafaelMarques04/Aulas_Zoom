package Aula7;

public class ProgramaçãoObjeto2 {

	public static void main(String[] args) {

		ProgramaçãoObjeto auto1 = new ProgramaçãoObjeto("Charles", "Audi Q8", "CHA1998", 2023);

		auto1.imprimirInfo();

		System.out.println("\n****Transferência de Proprietário");

		auto1.setNomeProprietario("Cinthia");

		auto1.imprimirInfo();

		System.out.println("\nAlteração da placa do automóvel");

		auto1.setPlaca("CIN2A00");

		auto1.imprimirInfo();
	}
}

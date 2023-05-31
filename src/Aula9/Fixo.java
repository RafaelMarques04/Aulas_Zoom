package Aula9;

public class Fixo extends Telefone{
	
	public Fixo() {
		super("Telefone Fixo");
	}
	
	@Override //essa anotação indica que o método toca é um método polimórfico
	public void toca(int numToques) {
		
		for(int i=0;i<numToques;i++) {
			System.out.println("\nTrimmmmm trimmmmmmmm");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: "+numero);
	}

}
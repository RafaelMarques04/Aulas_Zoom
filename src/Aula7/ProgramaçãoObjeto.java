package Aula7;

public class ProgramaçãoObjeto {

	// declaração de atributos da classe

	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	// criar o método construtor
	public ProgramaçãoObjeto(String nomeProprietario, String modelo, String placa, int ano) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	public ProgramaçãoObjeto(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	public ProgramaçãoObjeto() {
		super();

	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void imprimirInfo() {
		System.out.println(
				nomeProprietario + " possui um automóvel " + modelo + " com placa: " + placa + " e ano: " + ano);
	}
}
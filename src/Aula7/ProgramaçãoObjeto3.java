package Aula7;

import java.text.NumberFormat;

public class ProgramaçãoObjeto3 {

	private String nome;
	private double salario;

	public ProgramaçãoObjeto3(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public ProgramaçãoObjeto3(double salario) {
		super();
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double percentual) {

		salario *= 1 + percentual / 100;
	}

	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();// pega a moeda padrão do país no nosso caso R$
		nf.setMinimumFractionDigits(2);// estabelece o número de casas depois da virgula
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}

	public void imprimir() {
		System.out.println(nome + "\t\t" + " Salário: " + this.formatarMoeda());
	}
}
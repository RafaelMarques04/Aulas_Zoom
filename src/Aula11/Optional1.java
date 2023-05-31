package Aula11;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {

		Colaborador c1 = new Colaborador(1L, "Tames Bond", 1000.0f);

		Optional<Colaborador> colaboradorOptional = Optional.of(c1);

		colaboradorOptional.map(resposta -> resposta.getNome())
				.filter(colaboradorNome -> colaboradorNome.startsWith("T"))
				.orElseThrow(() -> new RuntimeException("Colaborador nÃ£o encontrado!"));

		System.out.println("\nNome do Colaborador: " + colaboradorOptional.get().getNome());

	}

}
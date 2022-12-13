package br.com.alura;

import java.util.Collection;
import java.util.Collections;

public class TesteEmptySet {

	public static void main(String[] args) {

		Collection<String> nomes = Collections.emptySet();
		nomes.add("Rodrigo");
		
		/*
		 * Iremos receber a exceção UnsupportedOperationException.
		 * Um conjunto destinado a ser vazio não pode ter um elemento.
		 * Então faz sentido receber essa exceção, mas para que um conjunto vazio é útil?
		 * 
		 * Por exemplo, imagina que precisamos representar um curso que foi cancelado pois não
		 * teve matriculas. Nesse caso faz sentido devolver um Collections.emptySet()
		 * 
		 */
		
	}

}
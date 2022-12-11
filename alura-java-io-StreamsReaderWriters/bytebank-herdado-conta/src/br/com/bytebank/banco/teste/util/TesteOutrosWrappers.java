package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println(idadeRef.intValue()); // Unboxing
		
		Double dRef = Double.valueOf(3.2); // Autoboxing
		System.out.println(dRef.doubleValue());// Unboxing
		
		Boolean bRef = Boolean.FALSE; // Autoboxing
		System.out.println(bRef.booleanValue()); // Unboxing
		
		Number refNumero = Integer.valueOf(29);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
		
		
	}

}

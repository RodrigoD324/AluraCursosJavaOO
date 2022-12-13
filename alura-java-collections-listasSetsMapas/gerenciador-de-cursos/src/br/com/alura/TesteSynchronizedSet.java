package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSynchronizedSet {

	public static void main(String[] args) throws Exception {

		try {
			Set<String> set = new HashSet<String>();
			set.add("1");
			set.add("2");
			set.add("3");

			System.out.println("Set: " + set);
			
			Set<String> synset = Collections.synchronizedSet(set);

			System.out.println("Set sincronizado e: " + synset);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception lancada: " + e);
		}

	}

}
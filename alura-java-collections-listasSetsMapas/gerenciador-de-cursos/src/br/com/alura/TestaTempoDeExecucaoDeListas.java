package br.com.alura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaTempoDeExecucaoDeListas {

	public static void main(String[] args) {

		System.out.println("**** ArrayList vs LinkedList ****");

		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();
		int quantidadeElementos = 1000000;

		long tempoArrayList = insereElementosNo(numerosArrayList, quantidadeElementos);
		long tempoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);

		System.out.println("Insercao na ArrayList demorou " + tempoArrayList);
		System.out.println("Insercao na LinkedList demorou " + tempoLinkedList);

		tempoArrayList = removePrimeirosElementos(numerosArrayList);
		tempoLinkedList = removePrimeirosElementos(numerosLinkedList);
	}

	/*
	 * removendo 100 elementos sempre na primeira posição
	 */
	private static long removePrimeirosElementos(List<Integer> numeros) {
		long ini = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			numeros.remove(0); // removendo sempre o primeiro elemento
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}
	
	private static long insereElementosNo(List<Integer> numeros, int quantidade) {
		long ini = System.currentTimeMillis();
		for(int i = 0; i < quantidade ; i++) {
			numeros.add(i);
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

}
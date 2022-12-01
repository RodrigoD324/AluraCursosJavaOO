package br.com.alura.main;

public class Teste {

	public static void main(String[] args) {
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		Prioridade pNormal = Prioridade.NORMAL;

		System.out.println(pMin.name());
		System.out.println(pNormal.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pNormal.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
		
	}

}

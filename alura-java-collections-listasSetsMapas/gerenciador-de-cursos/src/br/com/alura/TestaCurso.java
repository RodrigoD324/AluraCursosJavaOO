package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLista", 21));
		
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}
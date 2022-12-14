package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Rodrigo Silva", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno silva = new Aluno("Rodrigo Silva", 34672);
		System.out.println("E esse Silva, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(silva));
		
		System.out.println("O a1 e equals ao Silva?");
		System.out.println(a1.equals(silva));
		
		// obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == silva.hashCode());
		
		
	}

}
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos!");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voce nao tem 18, mas pode entrar, pois esta acompanhado!");
			} else {
				System.out.println("Infelizmente, voce nao pode entrar!");

			}
		}

	}
}
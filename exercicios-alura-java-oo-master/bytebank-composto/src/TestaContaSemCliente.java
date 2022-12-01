public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
<<<<<<< HEAD
		System.out.println(contaDaMarcela.getSaldo());
=======
		System.out.println(contaDaMarcela.saldo);
>>>>>>> d7a3072908b4cfa18fd935321d64dd468218c162
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
	
}
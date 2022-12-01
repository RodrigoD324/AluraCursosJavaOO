public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337 , 24226);
		System.out.println(conta.getNumero());
		
		Cliente rodrigo = new Cliente();
		//conta.titular = rodrigo;
		rodrigo.setNome("Rodrigo");
		
		conta.setTitular(rodrigo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(rodrigo);
		System.out.println(conta.getTitular());
		
		
	}	
}
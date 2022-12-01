public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente rodrigo = new Gerente();
		rodrigo.setNome("Rodrigo Silva");
		rodrigo.setCpf("123.456.789-01");
		rodrigo.setSalario(2600.0);
		
		System.out.println(rodrigo.getNome());
		System.out.println(rodrigo.getBonificacao());
		
		//rodrigo.salario = 300.0;

	}
}
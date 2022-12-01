
public class TestaBanco {

	public static void main(String[] args) {
		Cliente rodrigo = new Cliente();
		rodrigo.nome = "Rodrigo Silva";
		rodrigo.cpf = "537.345.938-08";
		rodrigo.profissao = "T.I.";
		
		Conta contaDoRodrigo = new Conta();
		contaDoRodrigo.deposita(100);
		
		// associa o cliente rodrigo a conta contaDoRodrigo
		contaDoRodrigo.titular = rodrigo;
		System.out.println(contaDoRodrigo.titular.nome);
	}
	
}

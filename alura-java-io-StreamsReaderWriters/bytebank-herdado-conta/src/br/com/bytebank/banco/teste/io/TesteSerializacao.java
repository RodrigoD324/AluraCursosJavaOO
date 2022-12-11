package br.com.bytebank.banco.teste.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo");
		cliente.setProfissao("Dev");
		cliente.setCpf("123456789");

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
	}

}
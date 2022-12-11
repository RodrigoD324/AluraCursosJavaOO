package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Rodrigo");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("123456789");
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getCpf());
		
	}

}
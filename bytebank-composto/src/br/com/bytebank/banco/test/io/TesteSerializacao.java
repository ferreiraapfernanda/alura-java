package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fernanda");
		cliente.setProfissao("Dev");
		cliente.setCpf("12354898");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(222.3);
		cc.setTitular(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}

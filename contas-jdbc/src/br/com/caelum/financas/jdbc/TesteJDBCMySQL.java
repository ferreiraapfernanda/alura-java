package br.com.caelum.financas.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.financas.modelo.Conta;

public class TesteJDBCMySQL {

	public static void main(String[] args) throws SQLException {

		Conta conta = new Conta();
		conta.setTitular("Joao Ferreira");
		conta.setBanco("Itau");
		conta.setAgencia("0063");
		conta.setNumero("432561");

		Connection con = new ConnectionFactory().getConnectionMySQL();

		con.setAutoCommit(false);

		ContaDAO dao = new ContaDAO(con);
		dao.adiciona(conta);

		List<Conta> lista = dao.lista();

		for (Conta c : lista) {
			System.out.println(c.getTitular());
		}

		con.commit();
		con.close();
	}

}

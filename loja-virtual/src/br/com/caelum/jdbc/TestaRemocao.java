package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();
		Statement stmt = connection.createStatement();
		stmt.execute("DELETE FROM Produto WHERE id > 3");
		int count = stmt.getUpdateCount();
		System.out.println("Linhas atualizadas " + count);
		
		stmt.close();
		connection.close();
		
		
	}
}

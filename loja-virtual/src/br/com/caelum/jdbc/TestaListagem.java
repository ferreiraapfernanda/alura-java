package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();

		Statement statement = connection.createStatement();
		boolean resultado = statement.execute("SELECT * FROM Produto");
		ResultSet resultSet = statement.getResultSet();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");

			System.out.println(id + " - " + nome + " - " + descricao);
		}

		resultSet.close();
		statement.close();
		connection.close();
	}

	
}

package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsercao {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();

		Statement statement = connection.createStatement();

		boolean resultado = statement.execute(
				"INSERT INTO Produto (nome, descricao) values ('Notebook', 'Notebook i5')",
				Statement.RETURN_GENERATED_KEYS);
		System.out.println(resultado); // false pois só inseriu

		ResultSet resultSet = statement.getGeneratedKeys();

		while (resultSet.next()) {
			System.out.println("ID gerado é " + resultSet.getString("id"));
		}

		statement.close();
		connection.close();
	}
}

package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		String nome = "Notebook'i5";
		String descricao = "Notebook i5";

		Connection connection = Database.getConnection();

		String sql = "INSERT INTO Produto (nome, descricao) values (?,?)";
		PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		statement.setString(1, nome);
		statement.setString(2, descricao);

		boolean resultado = statement.execute();
		System.out.println(resultado); // false pois só inseriu

		ResultSet resultSet = statement.getGeneratedKeys();

		while (resultSet.next()) {
			System.out.println("ID gerado é " + resultSet.getString("id"));
		}

		resultSet.close();
		statement.close();
		connection.close();
	}
}

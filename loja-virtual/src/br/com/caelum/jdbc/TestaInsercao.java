package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = Database.getConnection()) {
			connection.setAutoCommit(false); // Só faz a inserção quando chamar o commit

			try {
				String sql = "INSERT INTO Produto (nome, descricao) values (?,?)";
				PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

				adiciona("TV LCD", "32 polegadas", statement);
				adiciona("Blueray", "Full HDMI", statement);
				connection.commit();
			} catch (Exception e) {
				e.printStackTrace();
				connection.rollback();
				System.out.println("Rollback efetuado");
			}

		}
	}

	private static void adiciona(String nome, String descricao, PreparedStatement statement) throws SQLException {

		if (nome.equals("Blueray")) {
			throw new IllegalArgumentException("Problema ocorrido");
		}

		statement.setString(1, nome);
		statement.setString(2, descricao);

		boolean resultado = statement.execute();
		System.out.println(resultado); // false pois só inseriu

		try (ResultSet resultSet = statement.getGeneratedKeys()) {

			while (resultSet.next()) {
				System.out.println("ID gerado é " + resultSet.getString("id"));
			}
		}
	}
}

package br.com.caelum.financas.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {

	private Connection connection;

	public BD(Connection connection) {
		this.connection = connection;
	}

	public void geraTabelaContas() {

		try {
			String schema = " CREATE TABLE Conta ( id INTEGER IDENTITY, titular VARCHAR(256), numero VARCHAR(256), "
					+ "banco VARCHAR(256), agencia VARCHAR(256),  )";
			Statement statement = this.connection.createStatement();
			statement.execute(schema);
		} catch (SQLException e) {
			// ignora se a tabela já existe
		}

	}

}

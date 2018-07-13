package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.modelo.Produto;

public class ProdutosDAO {

	private Connection con;

	public ProdutosDAO(Connection con) {
		this.con = con;
	}

	public void salva(Produto produto) throws SQLException {
		String sql = "INSERT INTO Produto (nome, descricao) values(?,?)";

		try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.execute();

			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if (rs.next()) {
					int id = rs.getInt("id");
					produto.setId(id);
				}
			}

		}
	}

	public List<Produto> lista() throws SQLException {

		List<Produto> produtos = new ArrayList<Produto>();

		String sql = "SELECT * FROM Produto";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String descricao = rs.getString("descricao");

					Produto produto = new Produto(nome, descricao);
					produto.setId(id);

					produtos.add(produto);
				}
			}

		}

		return produtos;
	}

}

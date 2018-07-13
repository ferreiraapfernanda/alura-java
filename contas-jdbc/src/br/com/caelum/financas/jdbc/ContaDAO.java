package br.com.caelum.financas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.financas.modelo.Conta;

public class ContaDAO {

	private Connection connection;

	public ContaDAO(Connection connection) {
		this.connection = connection;
	}

	public void adiciona(Conta conta) {

		try {
			PreparedStatement ps = this.connection
					.prepareStatement("insert into Conta (titular, banco, agencia, numero) values (?,?,?,?)");
			ps.setString(1, conta.getTitular());
			ps.setString(2, conta.getBanco());
			ps.setString(3, conta.getAgencia());
			ps.setString(4, conta.getNumero());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Conta conta) {

		try {
			PreparedStatement ps = this.connection
					.prepareStatement("update Conta set titular=?, banco=?, agencia=?, numero=? where id=?");
			ps.setString(1, conta.getTitular());
			ps.setString(2, conta.getBanco());
			ps.setString(3, conta.getAgencia());
			ps.setString(4, conta.getNumero());
			ps.setInt(5, conta.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Conta conta) {

		try {
			PreparedStatement ps = this.connection
					.prepareStatement("delete from Conta where id=?");
			ps.setInt(1, conta.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Conta procura(Integer id) {

		try {
			PreparedStatement ps = this.connection
					.prepareStatement("select titular, banco, numero, agencia from Conta where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (!rs.next()) {
				return null;
			}
			Conta conta = new Conta();
			conta.setTitular(rs.getString("titular"));
			conta.setBanco(rs.getString("banco"));
			conta.setNumero(rs.getString("numero"));
			conta.setAgencia(rs.getString("agencia"));
			ps.close();
			return conta;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Conta> listaPaginada(int primeiro, int quantidade) {

		try {
			PreparedStatement ps = this.connection
					.prepareStatement("select titular, banco, numero, agencia from Conta limit ?,? ");
			ps.setInt(1, primeiro);
			ps.setInt(2, quantidade);

			ResultSet rs = ps.executeQuery();

			List<Conta> lista = new ArrayList<Conta>();

			while (rs.next()) {
				Conta conta = new Conta();
				conta.setTitular(rs.getString("titular"));
				conta.setBanco(rs.getString("banco"));
				conta.setNumero(rs.getString("numero"));
				conta.setAgencia(rs.getString("agencia"));
				lista.add(conta);
			}

			ps.close();
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Conta> lista() {

		try {
			PreparedStatement ps = this.connection
					.prepareStatement("select titular, banco, numero, agencia from Conta");
			ResultSet rs = ps.executeQuery();

			List<Conta> lista = new ArrayList<Conta>();

			while (rs.next()) {
				Conta conta = new Conta();
				conta.setTitular(rs.getString("titular"));
				conta.setBanco(rs.getString("banco"));
				conta.setNumero(rs.getString("numero"));
				conta.setAgencia(rs.getString("agencia"));
				lista.add(conta);
			}

			ps.close();
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Conta> procuraPeloNome(String nome) {

		try {
			PreparedStatement ps = this.connection
					.prepareStatement("select titular, banco, numero, agencia from Conta where titular like ?");
			ps.setString(1, "%" + nome + "%");
			ResultSet rs = ps.executeQuery();

			List<Conta> lista = new ArrayList<Conta>();

			while (rs.next()) {
				Conta conta = new Conta();
				conta.setTitular(rs.getString("titular"));
				conta.setBanco(rs.getString("banco"));
				conta.setNumero(rs.getString("numero"));
				conta.setAgencia(rs.getString("agencia"));
				lista.add(conta);
			}

			ps.close();
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

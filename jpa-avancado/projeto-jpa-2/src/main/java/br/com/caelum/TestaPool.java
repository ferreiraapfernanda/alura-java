package br.com.caelum;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestaPool {

	public static void main(String[] args) throws SQLException, PropertyVetoException {

		ComboPooledDataSource datasource = (ComboPooledDataSource) new JpaConfigurator().getDataSource();
		
		for(int x  = 0; x < 10; x++) {
			Connection connection1 = datasource.getConnection();

			System.out.println(datasource.getNumBusyConnections());
			System.out.println(datasource.getNumIdleConnections());
			System.out.println("-----");
		}

	}
}

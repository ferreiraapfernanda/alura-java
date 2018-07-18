package br.com.casadocodigo.loja.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		// Pega o EntityManager que o Spring gerencia
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

		// Adapter ?
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

		// Datasource, que define algumas configurações do banco de dados
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("username");
		dataSource.setPassword("password");
		dataSource.setUrl("jdbc:mysql://localhost/casadocodigo");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");

		// Propriedades do Hibernate que iremos especificar
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");

		factoryBean.setDataSource(dataSource);
		factoryBean.setJpaVendorAdapter(vendorAdapter);
		factoryBean.setJpaProperties(properties);

		factoryBean.setPackagesToScan("br.com.casadocodigo.loja.models");

		return factoryBean;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}
}

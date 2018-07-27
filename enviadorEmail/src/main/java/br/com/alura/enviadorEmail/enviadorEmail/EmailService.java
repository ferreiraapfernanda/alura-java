package br.com.alura.enviadorEmail.enviadorEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	public void enviar(String nome, String emailDestinatario) {

		try {
			Email email = new SimpleEmail();

			email.setHostName("smtp.googleemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("email", "password"));
			email.setSSLOnConnect(true);

			email.setFrom("email");
			email.setSubject("Você foi convidado pelo ListaVIP");
			email.setMsg("Olá " + nome + ". Você acaba de ser convidado pelo ListaVIP.");
			email.addTo(emailDestinatario);
			email.send();

		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}

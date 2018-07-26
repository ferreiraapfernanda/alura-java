package br.com.alura.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class Configuracao {

	@RequestMapping("/")
	@ResponseBody
	String ola() {
		return "<h1>Olá. Bem-vindo ao sistema Lista VIP</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

}

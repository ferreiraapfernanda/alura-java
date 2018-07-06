package br.com.alura.gerenciador.web;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		req.getSession().setMaxInactiveInterval(10*60);
		req.getSession().removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}
}

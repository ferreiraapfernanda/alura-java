package br.com.alura.gerenciador.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getSession().setMaxInactiveInterval(10*60);
		req.getSession().removeAttribute("usuario.logado");
		//req.getSession().invalidate();
		
		PrintWriter writer = resp.getWriter();

		writer.println("<html><body>Deslogado com sucesso</body></html>");
	}
}

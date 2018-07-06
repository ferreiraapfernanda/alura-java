package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/executa")
public class Controller extends HttpServlet { // Servlet padrão para gerenciar as páginas

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Pega a tarefa do "/fazTudo?tarefa="
		String tarefa = req.getParameter("tarefa");

		if (tarefa == null) {
			throw new IllegalArgumentException("Você esqueceu de passar a tarefa");
		}

		// Monta o local em que a classe da tarefa está
		tarefa = "br.com.alura.gerenciador.web." + tarefa;
		
		try {
			// Cria um objeto genérico de acordo com a classe passada na tarefa
			Class<?> tipo = Class.forName(tarefa);
			Tarefa instancia = (Tarefa) tipo.newInstance();
			// Chama o método executa dessa classe, que retorna qual o JSP que deve ser exibido
			String pagina = instancia.executa(req, resp);
			// Faz o forward dessa requisição
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		// para onde redirecionar?
	}
}

package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class NovaEmpresa implements Tarefa {

    @Override
    public String executa(HttpServletRequest request,
            HttpServletResponse response) {

        String nome = request.getParameter("nome");

        Empresa empresa = new Empresa(nome);
        new EmpresaDAO().adiciona(empresa);

        request.setAttribute("nome", nome);

        return "/WEB-INF/paginas/novaEmpresa.jsp";

    }

}
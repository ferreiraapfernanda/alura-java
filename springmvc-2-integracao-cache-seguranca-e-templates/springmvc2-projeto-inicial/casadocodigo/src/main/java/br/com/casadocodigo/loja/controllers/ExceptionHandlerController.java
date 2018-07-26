package br.com.casadocodigo.loja.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(Exception.class)
	public ModelAndView trataDetalheNaoEncontrado(Exception e) {
		System.out.println("erro genérico acontecendo");
		e.printStackTrace();
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("exception", e);
		return modelAndView;
	}
}

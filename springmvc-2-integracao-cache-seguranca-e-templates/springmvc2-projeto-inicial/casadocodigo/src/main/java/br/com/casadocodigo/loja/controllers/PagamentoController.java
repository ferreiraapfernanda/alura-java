package br.com.casadocodigo.loja.controllers;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.loja.models.CarrinhoCompras;
import br.com.casadocodigo.loja.models.DadosPagamento;

@Controller
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	private CarrinhoCompras carrinho;
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/finalizar", method=RequestMethod.POST)
	public ModelAndView finalizar(RedirectAttributes model){
		String uri = "http://book-payment.herokuapp.com/payment";
		
		try {
			String response = restTemplate.postForObject(uri, new DadosPagamento(carrinho.getTotal()), String.class);
			model.addFlashAttribute("message", response);
			System.out.println(response);
			//método para tirar todos os livros do carrinho
			this.carrinho.limpa();
			return new ModelAndView("redirect:/");
		} catch (HttpClientErrorException e) {
			e.printStackTrace();
			model.addFlashAttribute("message", "Valor maior que o permitido! Compra negada!");
			return new ModelAndView("redirect:/");
		}
	}
}
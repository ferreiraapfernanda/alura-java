package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.loja.models.CarrinhoCompras;
import br.com.casadocodigo.loja.models.DadosPagamento;
import br.com.casadocodigo.loja.models.Usuario;

@Controller
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	private CarrinhoCompras carrinho;

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private MailSender sender;

	@RequestMapping(value = "/finalizar", method = RequestMethod.POST)
	public ModelAndView finalizar(@AuthenticationPrincipal Usuario usuario, RedirectAttributes model) {
		String uri = "http://book-payment.herokuapp.com/payment";

		try {
			String response = restTemplate.postForObject(uri, new DadosPagamento(carrinho.getTotal()), String.class);
			model.addFlashAttribute("message", response);
			enviaEmailCompraProduto(usuario);
			System.out.println(response);
			// método para tirar todos os livros do carrinho
			this.carrinho.limpa();
			return new ModelAndView("redirect:/");
		} catch (HttpClientErrorException e) {
			e.printStackTrace();
			model.addFlashAttribute("message", "Valor maior que o permitido! Compra negada!");
			return new ModelAndView("redirect:/");
		}
	}

	private void enviaEmailCompraProduto(Usuario usuario) {
		SimpleMailMessage email = new SimpleMailMessage();
		email.setSubject("Compra finalizada com sucesso!");
		//email.setTo(usuario.getEmail());
		email.setTo("ferreira.ap.fernanda@gmail.com");
		email.setText("Compra aprovada com sucesso o valor de " + carrinho.getTotal());
		email.setFrom("compras@casadocodigo.com.br");

		sender.send(email);
	}
}
package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {

	@AroundInvoke
	public Object intercepta(InvocationContext contex) throws Exception {

		long millis = System.currentTimeMillis();

		Object o = contex.proceed();

		String nomeClasse = contex.getTarget().getClass().getSimpleName();
		String nomeMetodo = contex.getMethod().getName();

		System.out.println("[INFO] " + nomeClasse + "->" + nomeMetodo);

		System.out.println("[INFO] Tempo gasto no acesso ao BD: " + (System.currentTimeMillis() - millis) + "ms");

		return o;
	}
}

package br.com.alura.gerenciador;

import javax.servlet.http.Cookie;

public class Cookies {

    private final Cookie[] cookies;

    public Cookies(Cookie[] cookies) {
        this.cookies = cookies;
    }

    public Cookie getUsuarioLogado() {
        if (cookies == null)
            return null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("usuario.logado")) {
                return cookie;
            }
        }
        return null;
    }

}	
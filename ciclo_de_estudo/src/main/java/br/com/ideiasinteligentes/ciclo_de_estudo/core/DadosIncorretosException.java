package br.com.ideiasinteligentes.ciclo_de_estudo.core;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class DadosIncorretosException extends Exception {

	private static final long serialVersionUID = -2551382595275914242L;

	public DadosIncorretosException(String mensagem) {
		super(mensagem);
	}
	
}

package br.com.ideiasinteligentes.ciclo_de_estudo;

import java.util.List;

public class Disciplina {

	private Long id;
	private String nome;
	private List<Assunto> assuntos;
	
	public Long getId() {
		return id;
	}
	
	public void adicionarAssunto(Assunto novoAssunto) {
		this.assuntos.add(novoAssunto);
	}
	
}

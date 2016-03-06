package br.com.ideiasinteligentes.ciclo_de_estudo;

import java.util.List;

public class Assunto {

	private Long id;
	private Disciplina disciplina;
	private List<Material> materiais;
	private List<Topico> topicos;
	
	public Long getId() {
		return id;
	}
	
}

package br.com.ideiasinteligentes.ciclo_de_estudo;

import java.util.List;

public class Aluno {

	private String email;
	private String senha;
	List<Ciclo> ciclos;
	
	public List<Ciclo> ciclos() {
		return this.ciclos;
	}
	
	public void novoCiclo(Ciclo novoCiclo) {
		this.ciclos.add(novoCiclo);
	}
	
}

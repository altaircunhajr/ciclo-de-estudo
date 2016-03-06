package br.com.ideiasinteligentes.ciclo_de_estudo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private Long id;
	private String email;
	private String senha;
	private List<Ciclo> ciclos = new ArrayList<Ciclo>();
	
	public List<Ciclo> ciclos() {
		return this.ciclos;
	}
	
	public void novoCiclo(Ciclo novoCiclo) {
		this.ciclos.add(novoCiclo);
	}
	
}

package br.com.ideiasinteligentes.ciclo_de_estudo.core;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno.Aluno;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@OneToMany
	private List<Assunto> assuntos;
	@ManyToOne
	private Aluno aluno;
	
	public Long getId() {
		return id;
	}
	
	public void adicionarAssunto(Assunto novoAssunto) {
		this.assuntos.add(novoAssunto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

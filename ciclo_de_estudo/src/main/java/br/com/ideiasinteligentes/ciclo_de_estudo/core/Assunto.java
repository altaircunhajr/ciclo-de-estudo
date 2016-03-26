package br.com.ideiasinteligentes.ciclo_de_estudo.core;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno.Aluno;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.material.Material;

@Entity
public class Assunto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Disciplina disciplina;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Material> materiais;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Topico> topicos;
	@ManyToOne
	private Aluno aluno;
	
	public Long getId() {
		return id;
	}
	
}

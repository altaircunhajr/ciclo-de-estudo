package br.com.ideiasinteligentes.ciclo_de_estudo.core;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno.Aluno;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.material.Material;

@Entity
public class Topico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Material> materiais;
	private Aluno aluno;
	
}

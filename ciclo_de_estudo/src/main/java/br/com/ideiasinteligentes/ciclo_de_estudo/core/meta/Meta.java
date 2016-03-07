package br.com.ideiasinteligentes.ciclo_de_estudo.core.meta;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno.Aluno;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo.Ciclo;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.material.Material;

@Entity
public class Meta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Calendar dataDeInicio;
	private Calendar dataDeConclusao;
	@ManyToOne
	private Ciclo ciclo;
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Material> materiais;
	private Aluno aluno;
	
	public void foiAlcancadaEm(Calendar dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}

	public Calendar getDataDeConclusao() {
		return this.dataDeConclusao;
	}
	
	public void adicionarAssunto(Material novoMaterial) {
		this.materiais.add(novoMaterial);
	}
	
	public void removerAssunto(Material material) {
		this.materiais.remove(material);
	}

	public Calendar getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(Calendar dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}
	
	public Ciclo getCiclo() {
		return this.ciclo;
	}
}

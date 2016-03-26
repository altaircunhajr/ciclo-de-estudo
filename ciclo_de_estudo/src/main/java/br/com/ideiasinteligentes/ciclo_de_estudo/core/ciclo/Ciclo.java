package br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno.Aluno;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.meta.Meta;

@Entity
public class Ciclo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Meta> metas = new ArrayList<Meta>();
	@ManyToOne
	private Aluno aluno;

	public void novaMeta(Meta novaMeta) {
		novaMeta.setCiclo(this);
		this.metas.add(novaMeta);
	}

	public void removeMeta(Meta meta) {
		metas.remove(meta);
	}

	public List<Meta> getMetas() {
		return metas;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void novasMetas(List<Meta> novasMetas) {
		for (Iterator<Meta> metas = novasMetas.iterator(); metas.hasNext();) {
			Meta meta = metas.next();
			novaMeta(meta);
		}
	}

}

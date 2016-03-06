package br.com.ideiasinteligentes.ciclo_de_estudo;

import java.util.List;

public class Ciclo {

	private Long id;
	private String nome;
	private List<Meta> metas;

	public void novaMeta(Meta novaMeta) {
		metas.add(novaMeta);
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

}

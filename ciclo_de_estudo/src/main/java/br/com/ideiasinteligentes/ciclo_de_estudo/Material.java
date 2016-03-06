package br.com.ideiasinteligentes.ciclo_de_estudo;

public abstract class Material {
	
	private Long id;
	private String localizacao;
	
	public abstract Long getTamanho();

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}

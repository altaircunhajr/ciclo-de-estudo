package br.com.ideiasinteligentes.ciclo_de_estudo;

import java.util.Calendar;
import java.util.List;

public class Meta {

	private Long id;
	private Calendar dataDeInicio;
	private Calendar dataDeConclusao;
	private List<Assunto> assuntos;
	
	public void foiAlcancadaEm(Calendar dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}

	public Calendar getDataDeConclusao() {
		return this.dataDeConclusao;
	}
	
	public void adicionarAssunto(Assunto novoAssunto) {
		this.assuntos.add(novoAssunto);
	}
	
	public void removerAssunto(Assunto assunto) {
		this.assuntos.remove(assunto);
	}
}

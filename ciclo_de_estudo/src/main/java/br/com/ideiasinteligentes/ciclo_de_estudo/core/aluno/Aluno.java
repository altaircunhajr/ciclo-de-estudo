package br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo.Ciclo;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;
	private String senha;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Ciclo> ciclos = new ArrayList<Ciclo>();

	public Aluno() {
	}

	public Aluno(String nome, String email) {
		this.setNome(nome);
		this.setEmail(email);
	}

	public List<Ciclo> getCiclos() {
		return this.ciclos;
	}

	public void novoCiclo(Ciclo novoCiclo) {
		this.ciclos.add(novoCiclo);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", email=" + getEmail() + ", ciclos=" + ciclos + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

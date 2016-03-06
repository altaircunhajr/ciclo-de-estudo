package br.com.ideiasinteligentes.ciclo_de_estudo;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {

	@Test
	public void deveAdicionarUmNovoCiclo() {
		Ciclo novoCiclo = new Ciclo();
		Aluno aluno = new Aluno();
		
		aluno.novoCiclo(novoCiclo);
		
		Assert.assertEquals(1, aluno.ciclos().size());
	}

}

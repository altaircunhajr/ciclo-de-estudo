package br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo;

import org.junit.Assert;
import org.junit.Test;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.meta.Meta;

public class CicloTest {

	@Test
	public void deveSeIncluirComoCicloDaNovaMeta() {
		Ciclo ciclo = new Ciclo();
		Meta novaMeta = new Meta();
		ciclo.novaMeta(novaMeta);
		
		Assert.assertEquals(ciclo, novaMeta.getCiclo());
		Assert.assertEquals(1, ciclo.getMetas().size());
	}

}

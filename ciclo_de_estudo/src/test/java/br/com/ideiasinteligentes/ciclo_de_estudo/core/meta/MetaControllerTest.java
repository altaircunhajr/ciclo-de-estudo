package br.com.ideiasinteligentes.ciclo_de_estudo.core.meta;

import org.junit.Test;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.DadosIncorretosException;

public class MetaControllerTest {

	@Test(expected = DadosIncorretosException.class)
	public void deveValidarADataDeConclusaoAntesDeAlterarAMeta() throws DadosIncorretosException {
		MetaController metaController = new MetaController();
		metaController.concluirMeta(1L, "11/06/99 ");
	}

}

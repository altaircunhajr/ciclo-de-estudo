package br.com.ideiasinteligentes.ciclo_de_estudo;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class MetaDeEstudoTest {

	@Test
	public void deveDefinirADataDeConclusaoQuandoForAlcancada() {
		Meta metaDeEstudo = new Meta();
		Calendar dataDeConclusao = Calendar.getInstance();
		dataDeConclusao.setTime(new Date());
		metaDeEstudo.foiAlcancadaEm(dataDeConclusao);
		
		Assert.assertTrue(metaDeEstudo.getDataDeConclusao().equals(dataDeConclusao));
		
	}

}

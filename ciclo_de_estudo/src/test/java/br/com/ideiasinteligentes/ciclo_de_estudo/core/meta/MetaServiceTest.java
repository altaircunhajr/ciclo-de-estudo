package br.com.ideiasinteligentes.ciclo_de_estudo.core.meta;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo.Ciclo;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo.CicloRepository;

public class MetaServiceTest {

	@Mock
	private CicloRepository cicloRepository;
	
	@Mock
	private MetaRepository metaRepository;
	
	@InjectMocks
	private MetaService metaService;
	

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void devePersistirAsMetasDepoisDeIncluiLasNoCiclo() {
		Ciclo cicloMock = new Ciclo();
		Mockito.when(cicloRepository.findOne(Matchers.anyLong())).thenReturn(cicloMock);
		
		Meta novaMeta = new Meta();
		metaService.adicionaMetaACiclo(novaMeta, 1L);
		
		Mockito.verify(metaRepository).save(novaMeta);
		
		ArrayList<Meta> novasMetas = new ArrayList<Meta>();
		
		metaService.adicionaMetasACiclo(novasMetas, 1L);
		Mockito.verify(metaRepository).save(novasMetas);
	}

}

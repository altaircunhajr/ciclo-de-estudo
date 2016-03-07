package br.com.ideiasinteligentes.ciclo_de_estudo.core.meta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo.Ciclo;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo.CicloRepository;

@Service
public class MetaService {

	@Autowired
	MetaRepository metaRepository;
	
	@Autowired
	CicloRepository cicloRepository;
	
	
	public Meta adicionaMetaACiclo(Meta novaMeta, Long idCiclo) {
		Ciclo ciclo = cicloRepository.findOne(idCiclo);
		ciclo.novaMeta(novaMeta);
		return metaRepository.save(novaMeta);
	}

	public Iterable<Meta> adicionaMetasACiclo(List<Meta> novasMetas, Long idCiclo) {
		Ciclo ciclo = cicloRepository.findOne(idCiclo);
		ciclo.novasMetas(novasMetas);
		return metaRepository.save(novasMetas);
	}

}

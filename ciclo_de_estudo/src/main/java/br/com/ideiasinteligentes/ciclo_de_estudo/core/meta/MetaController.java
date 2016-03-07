package br.com.ideiasinteligentes.ciclo_de_estudo.core.meta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.DadosIncorretosException;

@RestController
public class MetaController {

	@Autowired
	MetaRepository metaRepository;
	
	@Autowired
	MetaService metaService;

	@RequestMapping(value = "/ciclos/{idCiclo}/metas", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Meta>> listaMetasPorCicloViaUrl(@PathVariable Long idCiclo) {
		return new ResponseEntity<Iterable<Meta>>(metaRepository.listaMetasPorCiclo(idCiclo), HttpStatus.OK);
	}
	

	@RequestMapping(value = "/ciclos/{idCiclo}/metas/{idMeta}", method = RequestMethod.GET)
	public ResponseEntity<Meta> recuperaMeta(@PathVariable Long idMeta) {
		return new ResponseEntity<Meta>(metaRepository.findOne(idMeta), HttpStatus.OK);
	}

	@RequestMapping(value = "/ciclos/{idCiclo}/metas", method = RequestMethod.PUT)
	public ResponseEntity<Meta> adicionaMeta(@PathVariable Long idCiclo, @RequestParam Meta novaMeta) {
		return new ResponseEntity<Meta>(metaService.adicionaMetaACiclo(novaMeta, idCiclo), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/ciclos/{idCiclo}/metas", method = RequestMethod.POST)
	public ResponseEntity<Iterable<Meta>> adicionaMetas(@PathVariable Long idCiclo, @RequestParam List<Meta> novasMetas) {
		return new ResponseEntity<Iterable<Meta>>(metaService.adicionaMetasACiclo(novasMetas, idCiclo), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/ciclos/{idCiclo}/metas/{idMeta}", method = RequestMethod.DELETE)
	public ResponseEntity<Meta> removeMeta(@PathVariable Long idMeta) {
		metaRepository.delete(idMeta);
		return new ResponseEntity<Meta>(HttpStatus.MOVED_PERMANENTLY);
	}
	
	@RequestMapping(value = "/ciclos/{idCiclo}/metas/{idMeta}/data-de-conclusao", method = RequestMethod.POST)
	public ResponseEntity<Meta> concluirMeta(@PathVariable Long idMeta, @RequestParam String dataConclusao) throws DadosIncorretosException {
		final String formatoCorretoDeData = "dd/MM/yyyy HH:mm";
		Date dataConvertida = null;
		try {
			dataConvertida = new SimpleDateFormat(formatoCorretoDeData).parse(dataConclusao);
		} catch (ParseException e) {
			throw new DadosIncorretosException("O formato da data está incorreto. Utilize o formato: " + formatoCorretoDeData);
		}
		
		Calendar data = Calendar.getInstance();
		data.setTime(dataConvertida);
		
		Meta meta = metaRepository.findOne(idMeta);
		meta.foiAlcancadaEm(data);
		return new ResponseEntity<Meta>(metaRepository.save(meta), HttpStatus.MOVED_PERMANENTLY);
	}

}

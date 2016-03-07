package br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ciclos")
public class CicloController {

	@Autowired
	private CicloRepository cicloRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<Ciclo>> ciclos(@PathVariable Long idAluno) {
		return new ResponseEntity<Iterable<Ciclo>>(cicloRepository.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Ciclo> adicionaCiclo(@RequestParam Ciclo novoCiclo) {
		return new ResponseEntity<Ciclo>(cicloRepository.save(novoCiclo), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/ciclos/{idCiclo}", method = RequestMethod.GET)
	public ResponseEntity<Ciclo> recuperaCiclo(@PathVariable Long idCiclo) {
		return new ResponseEntity<Ciclo>(cicloRepository.findOne(idCiclo), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{idCiclo}",method = RequestMethod.DELETE)
	public ResponseEntity<Ciclo> removeCiclo(@PathVariable Long idCiclo) {
		return new ResponseEntity<Ciclo>(HttpStatus.OK);
	}
		
}

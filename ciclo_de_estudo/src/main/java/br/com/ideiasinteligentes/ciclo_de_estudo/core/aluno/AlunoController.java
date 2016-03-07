package br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<Aluno>> listaAlunos() {
		return new ResponseEntity<Iterable<Aluno>>(alunoRepository.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{idAluno}", method = RequestMethod.GET)
	public ResponseEntity<Aluno> recuperaAluno(@PathVariable Long idAluno) {
		return new ResponseEntity<Aluno>(alunoRepository.findOne(idAluno), HttpStatus.OK);
	}
	
	
	
}

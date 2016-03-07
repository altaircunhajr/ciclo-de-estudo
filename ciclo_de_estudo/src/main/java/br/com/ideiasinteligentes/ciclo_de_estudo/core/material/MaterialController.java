package br.com.ideiasinteligentes.ciclo_de_estudo.core.material;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialController {
	
	private final Long ID_ALUNO = 1L;

	@Autowired
	private MaterialRepository materialRepository;
	
	@RequestMapping(value = "/ciclos/{idCiclo}/metas/{idMeta}/materiais", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Material>> listaMateriaisPorCicloEMetaViaUrl(@PathVariable Long idCiclo, @PathVariable Long idMeta) {
		return new ResponseEntity<Iterable<Material>>(materialRepository.listaMateriaisPorCicloEMeta(idCiclo, idMeta, ID_ALUNO), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/materiais/{idMaterial}", method = RequestMethod.GET)
	public ResponseEntity<Material> recuperarMaterial(@PathVariable Long idMaterial) {
		return new ResponseEntity<Material>(materialRepository.findById(idMaterial, ID_ALUNO), HttpStatus.FOUND);
	}
	
}

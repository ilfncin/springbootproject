package br.cnj.projeto.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cnj.projeto.model.CasoJudicial;
import br.cnj.projeto.services.CasoJudicialService;

@RestController
@RequestMapping("/api/casos")
public class CasoJudicialController {

	private final CasoJudicialService service;

	public CasoJudicialController(CasoJudicialService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<CasoJudicial>> getTodosOsCasos() {
		List<CasoJudicial> casos = this.service.getTodosOsCasos();
		return ResponseEntity.ok(casos);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CasoJudicial> getCasoJudicialPorId(@PathVariable Long id) throws Exception {
		CasoJudicial caso = this.service.getCasoJudicialPorId(id);
		return ResponseEntity.ok(caso);
	}

	@PostMapping
	public ResponseEntity<CasoJudicial> criarCasoJudicial(@RequestBody CasoJudicial novoCaso) {
		this.service.criarCasoJudicial(novoCaso);
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(novoCaso);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CasoJudicial> atualizarCasoJudicial(@PathVariable Long id,
			@RequestBody CasoJudicial casoAtualizado) throws Exception {
		if (this.service.atualizarCasoJudicial(id, casoAtualizado)) {
			return ResponseEntity.ok(casoAtualizado);
		} else {
			return ResponseEntity.badRequest().build();
		}
	}

	@PatchMapping
	public ResponseEntity<String> ajustarCasoJudicial(@PathVariable Long id,
			@RequestBody Map<String, Object> atualizacoes) throws Exception {
		if (this.service.atualizarCasoJudicial(id, atualizacoes)) {
			return ResponseEntity.ok("Sucesso ao atualizar o caso judicial: " + id);
		} else {
			return ResponseEntity.badRequest().body("Falha ao atualizar o caso judicial: " + id);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removerCasoJudicial(@PathVariable Long id) throws Exception {
		if (this.service.removerCasoJudicialPorId(id)) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.badRequest().build();
		}
	}

	//Método da Aula
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> removerCasoJudicial(@PathVariable Long id) throws Exception {
//		this.service.removerCasoJudicialPorId(id);
//		return ResponseEntity.noContent().build();
//	}

}
package br.cnj.projeto.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cnj.projeto.model.CasoJudicial;

@Service
public class CasoJudicialService {

	// private final CasoJudicialRepository repository;

	private List<CasoJudicial> casosJudiciais;

	@Autowired
	public CasoJudicialService() {// CasoJudicialRepository repository) {
		// this.repository = repository;
		this.casosJudiciais = new ArrayList<CasoJudicial>(
				Arrays.asList(new CasoJudicial(1L, 'A', "Caso 1"), new CasoJudicial(2L, 'B', "Caso 2"),
						new CasoJudicial(3L, 'C', "Caso 3"), new CasoJudicial(4L, 'D', "Caso 4")));
	}

	public List<CasoJudicial> getTodosOsCasos() {
		return this.casosJudiciais;// (List<CasoJudicial>) repository.findAll();
	}

	public CasoJudicial getCasoJudicialPorId(Long id) {
		Optional<CasoJudicial> result = this.casosJudiciais.stream().filter(item -> item.getId().equals(id))
				.findFirst();

		if (!result.isPresent()) {
			return null;
		}

		return result.get();// (List<CasoJudicial>) repository.findAll();
	}

	public void criarCasoJudicial(CasoJudicial casoJudicial) {
		this.casosJudiciais.add(casoJudicial);
	}

	public boolean atualizarCasoJudicial(Long id, CasoJudicial casoAtualizado) {
		CasoJudicial casoJudicialAAtualizar = this.getCasoJudicialPorId(id);

		if (casoJudicialAAtualizar != null) {
			this.casosJudiciais.remove(casoJudicialAAtualizar);
			// evitar alteração do ID
			casoAtualizado.setId(id);
			this.casosJudiciais.add(casoAtualizado);
			return true;
		}
		return false;
	}

	public boolean atualizarCasoJudicial(Long id, Map<String, Object> atualizacoes) throws Exception {
		CasoJudicial casoJudicial = this.getCasoJudicialPorId(id);
		for (Map.Entry<String, Object> entry : atualizacoes.entrySet()) {
			String atributo = entry.getKey();
			Object valor = entry.getValue();
			try {
				casoJudicial.getClass().getDeclaredField(atributo).setAccessible(true);
				casoJudicial.getClass().getDeclaredField(atributo).set(casoJudicial, valor);
			} catch (NoSuchFieldException | IllegalAccessException e) {
				return false;
			}
		}
		return true;
	}

	public boolean removerCasoJudicialPorId(Long id) throws Exception {
		CasoJudicial casoJudicialAAtualizar = this.getCasoJudicialPorId(id);

		if (casoJudicialAAtualizar != null) {
			this.casosJudiciais.remove(casoJudicialAAtualizar);
			return true;
		}
		return false;
	}

}

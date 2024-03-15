package br.cnj.projeto;

import org.springframework.stereotype.Component;

@Component
public class TaxaJudicial {
	
	public double adicionarTaxa(String estado) {
		double taxa = 10.0;
		if (estado.equals("Distrito Federal")) {
			taxa = 20.00;
		}
		return taxa;
	}

}

package br.cnj.projeto.util;

import org.springframework.stereotype.Component;

@Component
public class TaxaJudicialUtil {
	
	public double adicionarTaxa(String estado) {
		double taxa = 10.0;
		if (estado.equals("Distrito Federal")) {
			taxa = 20.00;
		}
		return taxa;
	}

}

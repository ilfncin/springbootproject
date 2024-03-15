package br.cnj.projeto;

import org.springframework.stereotype.Component;

@Component
public class CustoJudicial {
	public double adicionarCusto(int anoJulgamento) {
		double custo = 10.0;
		if (anoJulgamento >= 2024) {
			custo = 20.00;
		}
		return custo;
	}
}

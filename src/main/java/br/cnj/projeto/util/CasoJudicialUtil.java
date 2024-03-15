package br.cnj.projeto.util;

import org.springframework.stereotype.Component;

@Component
public class CasoJudicialUtil {
		
	private CustoJudicialUtil custoJudicial;
	
	private TaxaJudicialUtil taxaJudicial;
	
	public CasoJudicialUtil(CustoJudicialUtil custoJudicial, TaxaJudicialUtil taxaJudicial) {
		this.custoJudicial = custoJudicial;
		this.taxaJudicial = taxaJudicial;
	}
	
	public double finalizarCusto(double custo, String estado, int anoJulgamento) {
		custo += custoJudicial.adicionarCusto(anoJulgamento);
		custo += taxaJudicial.adicionarTaxa(estado);
		return custo;
	}
	
	

}

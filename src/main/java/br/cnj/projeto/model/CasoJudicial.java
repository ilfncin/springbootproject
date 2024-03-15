package br.cnj.projeto.model;

import org.springframework.stereotype.Component;

@Component
public class CasoJudicial {
	private Long id;
	private char decisao;
	private String descricao;

	public CasoJudicial() {
	}

	public CasoJudicial(Long numero, char decisao, String descricao) {
		this.id = numero;
		this.decisao = decisao;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public char getDecisao() {
		return decisao;
	}

	public void setDecisao(char decisao) {
		this.decisao = decisao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

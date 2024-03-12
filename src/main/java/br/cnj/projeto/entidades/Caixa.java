package br.cnj.projeto.entidades;

import java.util.List;

public class Caixa {
	// id_caixa sq_tb_caixa
	private Long id;
	// nm_caixa
	private Boolean nome;
	// ds_caixa
	private Boolean provisorio;
	// in_sistema
	private Boolean sistema;

	private Tarefa tarefa;

	private List<Processo> processos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getNome() {
		return nome;
	}

	public void setNome(Boolean nome) {
		this.nome = nome;
	}

	public Boolean getProvisorio() {
		return provisorio;
	}

	public void setProvisorio(Boolean provisorio) {
		this.provisorio = provisorio;
	}

	public Boolean getSistema() {
		return sistema;
	}

	public void setSistema(Boolean sistema) {
		this.sistema = sistema;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public List<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processo> processos) {
		this.processos = processos;
	}

}

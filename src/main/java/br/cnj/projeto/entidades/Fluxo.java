package br.cnj.projeto.entidades;

import java.time.LocalDateTime;
import java.util.List;

public class Fluxo {

	// id_fluxo sq_tb_fluxo
	private Long id;
	// cd_fluxo
	private String codigo;
	// ds_fluxo
	private String descricao;
	// in_ativo
	private Boolean ativo;
	// qt_prazo
	private Long prazo;
	// in_publicado
	private Boolean publicado;
	// dt_inicio_publicacao
	private LocalDateTime dataInicio;
	// dt_fim_publicacao
	private LocalDateTime dataFim;
	// ds_xml
	private String descricaoXML;
	// dt_ultima_publicacao
	private LocalDateTime dataUltimaPublicacao;

	private List<Tarefa> tarefas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getPrazo() {
		return prazo;
	}

	public void setPrazo(Long prazo) {
		this.prazo = prazo;
	}

	public Boolean getPublicado() {
		return publicado;
	}

	public void setPublicado(Boolean publicado) {
		this.publicado = publicado;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricaoXML() {
		return descricaoXML;
	}

	public void setDescricaoXML(String descricaoXML) {
		this.descricaoXML = descricaoXML;
	}

	public LocalDateTime getDataUltimaPublicacao() {
		return dataUltimaPublicacao;
	}

	public void setDataUltimaPublicacao(LocalDateTime dataUltimaPublicacao) {
		this.dataUltimaPublicacao = dataUltimaPublicacao;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

}

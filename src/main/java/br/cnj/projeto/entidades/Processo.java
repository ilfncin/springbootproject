package br.cnj.projeto.entidades;

import java.time.LocalDateTime;
import java.util.List;

public class Processo {

	// id_processo sq_tb_processo
	private Long id;
	// nr_processo
	private String numero;
	// nr_processo_origem
	private String numeroOrigem;
	// ds_complemento
	private String complemento;
	// dt_inicio
	private LocalDateTime dataInicio;
	// id_jbpm
	private Long idJbpm;
	// dt_fim
	private LocalDateTime dataFim;
	// nr_duracao
	private Long duracao;
	// nm_actor_id
	private Long actorId;
	// ds_nm_usu_cadastro_processo
	private String usuarioCadastroProcesso;
	// id_pk_tb_processo_pg
	private Long idProcessoPg;
	// id_secao_pg
	private Long idSecaoPg;
	// nr_processo_temp
	private String numeroProcessoTemp;

	private Caixa caixa;

	private Status status;

	private List<Estatistica> estatisticas;

	public Processo() {
	}

	public Processo(String numero) {
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumeroOrigem() {
		return numeroOrigem;
	}

	public void setNumeroOrigem(String numeroOrigem) {
		this.numeroOrigem = numeroOrigem;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Long getIdJbpm() {
		return idJbpm;
	}

	public void setIdJbpm(Long idJbpm) {
		this.idJbpm = idJbpm;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public Long getDuracao() {
		return duracao;
	}

	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}

	public Long getActorId() {
		return actorId;
	}

	public void setActorId(Long actorId) {
		this.actorId = actorId;
	}

	public String getUsuarioCadastroProcesso() {
		return usuarioCadastroProcesso;
	}

	public void setUsuarioCadastroProcesso(String usuarioCadastroProcesso) {
		this.usuarioCadastroProcesso = usuarioCadastroProcesso;
	}

	public Long getIdProcessoPg() {
		return idProcessoPg;
	}

	public void setIdProcessoPg(Long idProcessoPg) {
		this.idProcessoPg = idProcessoPg;
	}

	public String getNumeroProcessoTemp() {
		return numeroProcessoTemp;
	}

	public void setNumeroProcessoTemp(String numeroProcessoTemp) {
		this.numeroProcessoTemp = numeroProcessoTemp;
	}

	public Long getIdSecaoPg() {
		return idSecaoPg;
	}

	public void setIdSecaoPg(Long idSecaoPg) {
		this.idSecaoPg = idSecaoPg;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Estatistica> getEstatisticas() {
		return estatisticas;
	}

	public void setEstatisticas(List<Estatistica> estatisticas) {
		this.estatisticas = estatisticas;
	}

}

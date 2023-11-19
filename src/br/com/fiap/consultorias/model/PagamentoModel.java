package br.com.fiap.consultorias.model;

import java.time.LocalDate;

public class PagamentoModel {
	private int idTransacao;
	public int getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}
	private String TitularCartao;
	private String  numeroCartao;
	private LocalDate validadeCartao;
	private int cvv;
	private int qtdParcelas;
	
	public String getTitularCartao() {
		return TitularCartao;
	}
	public void setTitularCartao(String titularCartao) {
		TitularCartao = titularCartao;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public LocalDate getValidadeCartao() {
		return validadeCartao;
	}
	public void setValidadeCartao(LocalDate validadeCartao) {
		this.validadeCartao = validadeCartao;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	
}

package br.com.fiap.consultorias.model;

import java.time.LocalDate;

public class Usuario {
	
	private int idfuncionario;
	private String nome;
	private String cargo;
	private double salario;
	private LocalDate data_contratacao;
	public int getIdfuncionario() {
		return idfuncionario;
	}
	public void setIdfuncionario(int idfuncionario) {
		this.idfuncionario = idfuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getData_contratacao() {
		return data_contratacao;
	}
	public void setData_contratacao(LocalDate data_contratacao) {
		this.data_contratacao = data_contratacao;
	}
	
	@Override
	public String toString() {
		return "Id-> " + idfuncionario + "\nFuncionarios-> "+ idfuncionario;
	}
	
}

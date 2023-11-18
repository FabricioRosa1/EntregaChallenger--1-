package br.com.fiap.consultorias.model;

import java.time.LocalDate;

public class Pagamento {

	private int idconsultoria;
	private int idcliente;
	private int idfuncionario;
	private int idjogo;
	private LocalDate data_consulta;
	private	double	duracao_horas;
	private double	preco;

	

	public Pagamento(int idconsultoria, int idcliente, int idfuncionario, int idjogo, LocalDate data_consulta,
			double duracao_horas, double preco) {
		super();
		this.idconsultoria = idconsultoria;
		this.idcliente = idcliente;
		this.idfuncionario = idfuncionario;
		this.idjogo = idjogo;
		this.data_consulta = data_consulta;
		this.duracao_horas = duracao_horas;
		this.preco = preco;
	}



	public Pagamento() {
		// TODO Auto-generated constructor stub
	}



	public int getIdconsultoria() {
		return idconsultoria;
	}



	public void setIdconsultoria(int idconsultoria) {
		this.idconsultoria = idconsultoria;
	}



	public int getIdcliente() {
		return idcliente;
	}



	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}



	public int getIdfuncionario() {
		return idfuncionario;
	}



	public void setIdfuncionario(int idfuncionario) {
		this.idfuncionario = idfuncionario;
	}



	public int getIdjogo() {
		return idjogo;
	}



	public void setIdjogo(int idjogo) {
		this.idjogo = idjogo;
	}



	public LocalDate getData_consulta() {
		return data_consulta;
	}



	public void setData_consulta(LocalDate data_consulta) {
		this.data_consulta = data_consulta;
	}



	public double getDuracao_horas() {
		return duracao_horas;
	}



	public void setDuracao_horas(double duracao_horas) {
		this.duracao_horas = duracao_horas;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	@Override
	public String toString() {
		return "Id-> " + idconsultoria + "\nConsultoria-> "+ idconsultoria;
	}
	

}

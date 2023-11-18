package br.com.fiap.consultorias.model;

import java.time.LocalDate;

import br.com.fiap.consultorias.dao.Conexao;
import br.com.fiap.consultorias.dao.ProdutoDao;

public class ProdutoApp {
	
	public static void main(String[] args) {
		
		
		Pagamento consultorias = new Pagamento();
		consultorias.setIdconsultoria(1);
		consultorias.setData_consulta(LocalDate.of(2000, 11, 20));
		consultorias.setDuracao_horas(10);
		consultorias.setPreco(10.2);
		consultorias.setIdfuncionario(1);
		consultorias.setIdcliente(1);
		consultorias.setIdjogo(1);
		
		ProdutoDao cDao = new ProdutoDao(Conexao.abrirConexao());
		cDao.gravar(consultorias);
		
	}

}

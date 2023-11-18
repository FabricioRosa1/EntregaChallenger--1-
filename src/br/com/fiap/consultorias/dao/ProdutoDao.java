package br.com.fiap.consultorias.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.consultorias.model.Pagamento;

public class ProdutoDao{
	
	private Connection conexao;
	
	public ProdutoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void gravar (Pagamento consultorias) {
		
		String sql = "INSERT INTO Consultorias (IDConsultoria, IDCliente, IDFuncionario, IDJogo, DuracaoEmHoras, Preco)"
				+ "VALUES (?, ?, ?, ?, ?, ?)";		
		try {
			PreparedStatement ps_Consultoria = conexao.prepareStatement(sql);
			
			ps_Consultoria.setInt(1, consultorias.getIdconsultoria());
			Date data = Date.valueOf(consultorias.getData_consulta());
			ps_Consultoria.setDate(2, data);
			ps_Consultoria.setInt(2, consultorias.getIdcliente());
			ps_Consultoria.setInt(3, consultorias.getIdfuncionario());
			ps_Consultoria.setInt(4, consultorias.getIdjogo());
			ps_Consultoria.setDouble(5, consultorias.getDuracao_horas());
			ps_Consultoria.setDouble(6, consultorias.getPreco());
			
			ps_Consultoria.execute();
			
			ps_Consultoria.close();
			
			conexao.close();
			
			System.out.println("Consultoria cadastrada com sucesso");
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar informações no banco");
			e.printStackTrace();
		}
		
	}

	//public void excluir (Consultorias consultorias) {
		
		
	//}
	
	//public void atualizar (Consultorias consultorias) {
		
		
	}

//}

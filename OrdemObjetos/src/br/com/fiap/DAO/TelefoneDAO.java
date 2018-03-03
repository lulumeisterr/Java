package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Telefone;
import br.com.fiap.conexao.ConexaoFactory;

public class TelefoneDAO {

	private Connection con;

	public TelefoneDAO()throws Exception{

		con = new ConexaoFactory().conectar();
	}

	public void fechar()throws Exception{

		con.close();
	}


	public String inserir(Telefone t, int numCliente)throws Exception{
		
		//NumCliente , pq n faz parte do objCliente
		
		//Estrutura
		
		PreparedStatement estrutura = con.prepareStatement
		("INSERT INTO TB_DD_TELEFONE "
				+ "(NR_DDD , NR_TELEFONE , NM_OPERADORA , NR_CLIENTE) VALUES(?,?,?,?)");
		
		estrutura.setInt(1, t.getDdd());
		estrutura.setString(2, t.getNumero());
		estrutura.setString(3, t.getOperadora());
		estrutura.setInt(4, numCliente);
		estrutura.execute();
		estrutura.close();
		
		return "Adicionado";
		
	}

	//Consultar por numero do Cliente
	
	public List<Telefone> consultarPorNumero (int numeroC)throws Exception{
		
		Telefone t = new Telefone();
		Cliente c = new Cliente();
		
		PreparedStatement estrutura = con.prepareStatement
				("SELECT * FROM TB_DDD_TELEFONE WHERE NR_CLIENTE = ? ");
		estrutura.setInt(1, numeroC);
		ResultSet rs = estrutura.executeQuery();
		List<Telefone> lista = new ArrayList<>();
		
		while(rs.next()){
			
			lista.add(new Telefone
					(rs.getInt("NR_DDD"), 
					rs.getString("NR_TELEFONE"), 
					rs.getString("NM_OPERADORA")));
		}
	
		rs.close();
		estrutura.close();
		return lista;
		
	}

	
	//Consultar Por operadora
	
	public List<Telefone> consultarPorOperadora(String operadora)throws Exception{
		
		PreparedStatement estrutura = con.prepareStatement("SELECT * FROM TB_DDD_TELEFONE WHERE NM_OPERADORA = ?");
		estrutura.setString(1, operadora + "%");
		ResultSet rs = estrutura.executeQuery();
		List<Telefone> lista = new ArrayList<>();
		while(rs.next()){
			//Instanciei direto do construtor
			lista.add(new Telefone (
					rs.getInt("NR_DDD"),
					rs.getString("NR_NUMERO"),
					rs.getString("NM_OPERADORA")));
		}
		rs.close();
		estrutura.close();
		return lista;
		
	}
	
	//Excluir por numero do Cliente
	
	public int excluirNumero(int numeroC)throws Exception{
		
		PreparedStatement estrutura = con.prepareStatement("DELETE FROM TB_DDD_TELEFONE WHERE NR_CLIENTE=?");
		estrutura.setInt(1, numeroC);
		int x = estrutura.executeUpdate();
		estrutura.close();
		
		return x;
	}
	
	
	//Excluindo por numero Telefone
	
	public int excluirPorNumeroTelefone(String numeroTelefone)throws Exception{
		
		PreparedStatement stmt = con.prepareStatement("DELETE FROM TB_DDD_PRODUTO WHERE NR_TELEFONE=?");
		stmt.setString(1, numeroTelefone);
		int x = stmt.executeUpdate();
		
		stmt.close();
		return x;
	}
	
	
	//Alterar por numeroTelefone
	
	public int alterarPorNumeroTelefone(Telefone obj)throws Exception{
		PreparedStatement stmt = con.prepareStatement
				("UPDATE TB_DDD_PRODUTO SET NM_OPERADORA=? WHERE NR_TELEFONE=?");
		stmt.setString(1, obj.getOperadora());
		stmt.setString(2, obj.getNumero());
		int x = stmt.executeUpdate();
		stmt.close();
		return x;
	}

}
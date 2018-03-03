package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Produto;
import br.com.fiap.conexao.ConexaoFactory;

public class ProdutoDAO {

	private Connection conectar;

	public ProdutoDAO()throws Exception{

		conectar = new ConexaoFactory().conectar();

	}

	public String FecharConexao()throws Exception{

		conectar.close();

		return "Conex�o Off";
	}
	
	
	//Consultar Produto por Codigo
	
	public String consultar(Produto p)throws Exception{
		
		PreparedStatement estrutura = conectar.prepareStatement("SELECT * FROM TB_DDD_PRODUTO WHERE CD_PRODUTO = ? ");
		estrutura.setInt(1, p.getCdProduto());

		ResultSet rs = estrutura.executeQuery();
		while(rs.next()){
			
			System.out.println("Codigo do produto : " + rs.getInt(1) + "\n" +
							   "Descri��o do produto : " + rs.getString(2) + "\n" +
							   "Nome da categoria do produto : " + rs.getString(3) + "\n" +
							   "Valor do produto : " + rs.getDouble(4));
		}
		
		
		estrutura.execute();
		rs.close();
		estrutura.close();
		
		return "Listado com Sucesso";
	}
	
	
	
	//Realizando a Consulta por ArrayList
	
	public List<Produto> ListarPorCodigo(int codigo)throws Exception{
		
		List<Produto> lista = new ArrayList<>();
		
		Produto p = new Produto();
		
		PreparedStatement estrutura = conectar.prepareStatement("SELECT * FROM TB_DDD_PRODUTO WHERE CD_PRODUTO = ?");
		estrutura.setInt(1, p.getCdProduto());
		
		ResultSet rs = estrutura.executeQuery();
		while(rs.next()){
			
			p = new Produto();
			
			p.setCdProduto(rs.getInt("CD_PRODUTO"));
			p.setDsProduto(rs.getString("DS_PRODUTO"));
			p.setNmCategoria(rs.getString("NM_CATEGORIA"));
			p.setValor(rs.getDouble("VL_VALOR"));
			lista.add(p);
		}
		
		rs.close();
		estrutura.close();
	
		return lista;
	}
	
	
	//Adicionando Produto
	
	public String addProd(Produto p)throws Exception{
		
		PreparedStatement estrutura = conectar.prepareStatement("INSERT INTO TB_DDD_PRODUTO VALUES (?, ?, ?, ?)");
		estrutura.setInt(1, p.getCdProduto());
		estrutura.setString(2, p.getDsProduto());
		estrutura.setString(3, p.getNmCategoria());
		estrutura.setDouble(4, p.getValor());
		estrutura.execute();
		estrutura.close();
		
		return "Produto Adicionado";
	}
	
	
	//AUMENTANDO A PORCENTAGEM
	
	public double AumentarValor(float valor)throws Exception{
		
		//VL_VALOR = VL_VALOR * ? e no Execute.set Faco o Calculo
		
		PreparedStatement estrutura = conectar.prepareStatement("UPDATE TB_DDD_CLIENTE set VL_VALOR = VL_VALOR * ?");
		estrutura.setDouble(1, 1 - (valor/100));
		double x = estrutura.executeUpdate();
		estrutura.close();
		
		return x;
	}
	
	//Retornando por um Arraylist
	
	public List<Produto> getRetornaCategoria(int qntCategoria)throws Exception{
		
		List<Produto> lista = new ArrayList<>();
		
		Produto objProd = new Produto();
		PreparedStatement estrutura = conectar.prepareStatement("SELECT * FROM TB_DDD_CLIENTE WHERE DS_DESCRICAO = ?");
		estrutura.setInt(1, qntCategoria);
		ResultSet resultado = estrutura.executeQuery();
		while(resultado.next()){
			
			objProd = new Produto();
			
			objProd.setCdProduto(resultado.getInt("CD_PRODUTO"));
			objProd.setDsProduto(resultado.getString("DS_PRODUTO"));
			objProd.setValor(resultado.getDouble("VL_VALOR"));
			objProd.setNmCategoria(resultado.getString("NM_CATEGORIA"));
			lista.add(objProd);
		}
		
		resultado.close();
		estrutura.close();
		
		return lista;
	}
	
	
	//Excluindo por codigo
	
	public int ExcluirProd(int numero)throws Exception{
		
		PreparedStatement estrutura = conectar.prepareStatement("DELETE FROM TB_DDD_CLIENTE WHERE NR_CLIENTE = ?");
		estrutura.setInt(1, numero);
		int x = estrutura.executeUpdate();
		estrutura.close();
		
		return x;
	}
}
	


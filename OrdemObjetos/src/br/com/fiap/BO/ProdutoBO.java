package br.com.fiap.BO;

import br.com.fiap.DAO.ProdutoDAO;
import br.com.fiap.bean.Produto;

public class ProdutoBO {
	
	
	//Adicionando um novo produto
	
	public static String novoProduto(Produto p)throws Exception{
		
		
		if(p.getDsProduto().trim().equals(null)|| p.getDsProduto().trim().length() < 5 || p.getDsProduto().trim().length() > 50){
			return "Deve possuir Descrição ou caracter's invalidos";
		}
		
		if(p.getValor() < 0){
			return "O valor deve ser maior que 0";
		}
		
	
		
		ProdutoDAO dao = new ProdutoDAO();
		String msg = dao.addProd(p);
		dao.FecharConexao();
		
		return msg;
		
	}
	

}

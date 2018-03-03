package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ProdutoDAO;
import br.com.fiap.bean.Produto;

public class InserindoPRODUTO {

	public static void main(String[] args) {

		ProdutoDAO dao = null;
		
		Produto p = new Produto();
		
		p.setCdProduto(20);
		p.setDsProduto("Carro");
		p.setNmCategoria("CHEVRO");
		
		try{
			
			dao = new ProdutoDAO();
			System.out.println(dao.addProd(p));
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				System.out.println(dao.FecharConexao());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	}
}
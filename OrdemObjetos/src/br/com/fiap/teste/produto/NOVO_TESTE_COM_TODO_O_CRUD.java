package br.com.fiap.teste.produto;

import javax.swing.JOptionPane;

import br.com.fiap.BO.ProdutoBO;
import br.com.fiap.DAO.ProdutoDAO;
import br.com.fiap.bean.Produto;

public class NOVO_TESTE_COM_TODO_O_CRUD {

	public static void main(String[] args) {

		ProdutoDAO pDAO = null;
		Produto p = new Produto();
		ProdutoBO bo = new ProdutoBO();
		
		
		String verificar = JOptionPane.showInputDialog(" Voc� deseja relizar | "
				+ "[ C ] - Consulta | "
				+ "[ I ] - Inserir "
				+ "[ U ] - Atualizar | "
				+ "[ D ] - Deletar");
//do
		
			if(verificar.equals("C")){
				try{
					pDAO= new ProdutoDAO();
					p.setCdProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto")));
					System.out.println(pDAO.consultar(p));
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					try{
					System.out.println(pDAO.FecharConexao());
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}else
				if(verificar.equals("I")){
					try{
						p.setCdProduto(Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto")));
						p.setDsProduto(JOptionPane.showInputDialog("DESCRICAO DO PRODUTO"));
						p.setNmCategoria(JOptionPane.showInputDialog("Nome da Categoria"));
						p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor")));
						System.out.println(ProdutoBO.novoProduto(p));
					}catch(Exception e){
						e.printStackTrace();
					}
					
				}else
					if(verificar.equals("U")){
						
						

					}else
						if(verificar.equals("E")){

						}


		//}while(verificar != "C" || verificar != "I" || verificar != "U" || verificar != "D");


	}
}

package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.bean.Cliente;

public class TESTANDO_COM_ARRAYLIST_CLIENTE {

	public static void main(String[] args) {
		
		ClienteDAO dao = null;
		
		//Retornando todas as pessoas que tem X quantidades de estrelas
		
		try{
			dao = new ClienteDAO();
			List<Cliente> lista = dao.ListarPorNivel
					(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de estrela")));
			
			//ForEach quando vc quer percorrer uma lista inteira e nao quer usar indice
			//Criando um objeto C : <- Para cada Elemento que estiver na minha Lista
			
			for (Cliente c : lista) {
			System.out.println(c.getNome());	
			System.out.println("");
			System.out.println(c.getNumero());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				System.out.println(dao.fecharConexao());
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}

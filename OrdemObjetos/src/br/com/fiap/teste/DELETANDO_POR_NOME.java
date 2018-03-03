package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.bean.Cliente;

public class DELETANDO_POR_NOME {

	public static void main(String[] args) {


		Cliente c = new Cliente();
		ClienteDAO dao = null;
		try{
			dao = new ClienteDAO();
			String nome = JOptionPane.showInputDialog("Deletando por nome");
			System.out.println(dao.DELETANDO_NAME(nome) + " Cliente(s) foi(ram) Apagado(s)!");
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

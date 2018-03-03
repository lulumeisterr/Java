package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.bean.Cliente;

public class DELETANDO_UM_CLIENTE_POR_COD {

	public static void main(String[] args) {

		int cont = 0;
		Cliente c = new Cliente();
		ClienteDAO dao = null;

		try{
			dao = new ClienteDAO();


			int indice = 0;
			int contador = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes voc� deseja deletar ?"));

			while(indice < contador){

				c.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo")));
				System.out.println(dao.deletandoUm_Cliente(c));

				indice++;
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

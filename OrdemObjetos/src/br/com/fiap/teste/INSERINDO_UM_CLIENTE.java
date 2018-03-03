package br.com.fiap.teste;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.bean.Cliente;

public class INSERINDO_UM_CLIENTE {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		ClienteDAO dao = null;
		
		c.setNome("LUCAS");
		c.setNumero(45);
		c.setQtdEstrelas(1);
		
		try{
			
		dao = new ClienteDAO();
		
		System.out.println(dao.Inserir(c));
		
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

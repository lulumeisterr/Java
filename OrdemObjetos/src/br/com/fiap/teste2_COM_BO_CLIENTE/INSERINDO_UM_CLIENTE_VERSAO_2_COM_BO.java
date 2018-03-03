package br.com.fiap.teste2_COM_BO_CLIENTE;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.BO.ClienteBO;
import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Telefone;

public class INSERINDO_UM_CLIENTE_VERSAO_2_COM_BO {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		ClienteDAO dao = null;
		
		Telefone fone = new Telefone();
		//Adicionar uma lista de telefone
		List<Telefone> listaTel = new ArrayList<>();
		do{
			
			//Instancio o obj Fone
			fone = new Telefone();
			fone.setDdd(011);
			fone.setNumero("11 977931383");
			fone.setOperadora("OI");
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?" , "Add Telefone" , 
				JOptionPane.YES_NO_OPTION , 
				JOptionPane.QUESTION_MESSAGE) == 0);
		
		//Fora do While eu seto o Telefone
		c.setFone(listaTel);
		
		c.setNome("LUCAS");
		c.setNumero(-21);
		c.setQtdEstrelas(1);
	
		try{
		//Metodo static n precisda instaciar o obj
		System.out.println(ClienteBO.novoCliente(c));
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println(Excecao.tratarEx(e)); Depois que estiver pronto
		}

	}

}

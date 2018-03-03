package br.com.fiap.teste2_COM_BO_CLIENTE;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.BO.ClienteBO;
import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Telefone;

public class Consultando_estrelaNivelComTelefone_bo {

	public static void main(String[] args) {
	
		try{
			
			List<Cliente> PorNivel = new ArrayList<Cliente>();
			PorNivel = ClienteBO.consultarPorNivel(Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de estela")));
			
			for (Cliente c : PorNivel) {
				System.out.println(c.getQtdEstrelas());
				System.out.println(c.getNumero());
				
				for (Telefone tel : c.getFone()) {
					
					System.out.println(tel.getDdd());
					System.out.println(tel.getNumero());
					System.out.println(tel.getOperadora());
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

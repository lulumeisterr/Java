package br.com.fiap.teste2_COM_BO_CLIENTE;

import br.com.fiap.BO.ClienteBO2_SEMBEAN;

public class INSERINDO_UM_CLIENTE_VERSAO_3_SEM_BEANS {

	public static void main(String[] args) {
		//SEM ACESSO O BEAN
		
		
		String nome = ("LUCAS");
		int numero = (-21);
		int estrela =(1);
		
		try{
		
		//PASSAGEM DE PARAMETRO
		System.out.println(ClienteBO2_SEMBEAN.novoCliente(nome,numero,estrela));
		}catch(Exception e){
			
			e.printStackTrace();
			
		}

	}

}

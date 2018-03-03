package br.com.fiap.conexao;

import java.sql.Connection;


public class TesteConexao {

	public static void main(String[] args) {
		
		Connection c = null;
		
		try{
			
			new ConexaoFactory();
			c = ConexaoFactory.conectar();
			System.out.println("Abriu");
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Erro de conexão");
		}finally{
			try{
			c.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
	
	//Fornecer conex�o para fornecer para todas as classes
	
		public static Connection conectar()throws Exception{
	
			return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL","rm76583","270298");
			
//			FileReader arquivo = new FileReader("D:/FIAP2/Java/2Semestre/banco.txt");
//			BufferedReader dados = new BufferedReader(arquivo);
//			String url = dados.readLine();
//			usuario = dados.readLine();
//			senha = dados.readLine();
//			if(url.indexOf("oracle") > 0){
//				Class.forName("oracle.jdbc.drive.OracleDrive");
//			}else if(url.indexOf("mysql") > 0){
//				Class.forName("com.mysql.jdbc.Driver");
//			}
//			dados.close();
//			return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL","rm76583","270298");
			
//		}
			
		}
}

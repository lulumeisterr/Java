package br.com.fiap.exececao;

import java.sql.SQLException;

public class Excecao extends Exception {

	
	// 1 Tornar ela como Excecao
	// 2 Criar um metodo para Realizar
	// se e for instanciado de SQLExcpetion
	
	public static String tratarEx(Exception e){
		if(e instanceof SQLException){
			return "Erro com o banco de dados";
		}else
			if(e instanceof NumberFormatException){
				return "Falha ao converter o numero";
			}else{
				return "Erro Desconhecido";
			}
		
	}
	
	
}

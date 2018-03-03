package br.com.fiap.test;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.bean.Cargo;

public class InterfaceMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cargo c1 = new Cargo("Junior" , "Medio" , 1200);
		Cargo c2 = new Cargo("Desenvolvedor" , "Maximo" , 4000);
		
		Map<String, Cargo> CargosMap = new HashMap<String, Cargo>();
		
		//Adicionando
		CargosMap.put("1", c1);
		CargosMap.put("2", c2);
		
		//Retornando um objeto atraves da chave
		Cargo objCargo = CargosMap.get("1");
		System.out.println(objCargo.getCargo());
		
		//Exibindo chave
		System.out.println(CargosMap.keySet());
		
		//Exibindo os valores dos objetos
		for (Cargo c : CargosMap.values()) {
			System.out.println(c.getCargo());
		}
		
		
	}

}
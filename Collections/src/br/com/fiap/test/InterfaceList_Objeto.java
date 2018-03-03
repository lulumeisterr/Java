package br.com.fiap.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.com.fiap.bean.Cargo;

public class InterfaceList_Objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Cargo> c = new ArrayList<Cargo>();
		
		c.add(new Cargo("DBA","JUNIOR",7000));
		c.add(new Cargo("Estagiario","Pleno",1200));
		c.add(new Cargo("Desenvolvedor","Senior",4000));
		
		Collections.sort(c);
		System.out.println(c);
		
		for (Cargo cargo : c) {
			System.out.println(cargo.getCargo());
			System.out.println(cargo.getNivel());
			System.out.println(cargo.getSalario());
			
		}
	}

}

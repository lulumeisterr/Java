package br.com.fiap.bean;

import java.util.List;


/**
 
 * @author Lucas Rodrigues do Nascimento
 * @see Cliente
 * @see ClienteDAO
 * @version 1.0
 
 */

public class Cliente {

	private String nome;
	private int numero;
	private int qtdEstrelas;
	private List<Telefone> fone;

	public Cliente(String nome, int numero, int qtdEstrelas, List<Telefone> fone) {
		super();
		setNome(nome);
		setNumero(numero);
		setQtdEstrelas(qtdEstrelas);
		setFone(fone);
	}


	public List<Telefone> getFone() {
		return fone;
	}


	public void setFone(List<Telefone> fone) {
		this.fone = fone;
	}


	public Cliente(){
		
	}
	

	public Cliente(String nome, int numero, int qtdEstrelas) {
		setNome(nome);
		setNumero(numero);
		setQtdEstrelas(qtdEstrelas);
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtdEstrelas() {
		return qtdEstrelas;
	}
	public void setQtdEstrelas(int qtdEstrelas) {
		this.qtdEstrelas = qtdEstrelas;
	}
	
	
	
}

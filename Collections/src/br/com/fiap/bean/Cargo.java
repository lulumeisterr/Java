package br.com.fiap.bean;

public class Cargo implements Comparable<Cargo>{

	private String cargo;
	private String nivel;
	private double salario;
	
	
//	public int compareTo(Cargo Outro){
//		//Ele vai retornar Posi��o a cima -1 || 1 Posi��o abaixo || 0 Se for igual
//		
//		if(this.salario > Outro.salario){
//			return 1;
//		}else
//			if(this.salario < Outro.salario){
//				return -1;
//			}else{
//				return 0;
//			}
//	}
//	
	
	//Comparando Salario
	public int compareTo(Cargo Outro){
//	//Ele vai retornar Posi��o a cima -1 || 1 Posi��o abaixo || 0 Se for igual
		
		//AZ Decrescente
		return Outro.cargo.compareTo(this.cargo);
	}
	
//	public int compareTo(Cargo Outro){
				//crescente
////		//Ele vai retornar Posi��o a cima -1 || 1 Posi��o abaixo || 0 Se for igual
//			
//			return this.cargo.compareTo(Outro.cargo);
//		}
//	
	
	public Cargo(){
		
		
	}
	
	public Cargo(String cargo, String nivel, double salario) {
		super();
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}

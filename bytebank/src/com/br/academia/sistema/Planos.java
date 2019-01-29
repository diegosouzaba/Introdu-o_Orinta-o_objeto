package com.br.academia.sistema;

public class Planos{
	
	private String basico;
	private String intermediario;
	private String avancado;
		
	
	
	public void getBasico(String basico){
		System.out.println("O plano basico tem direito a:");
	}
	
	public void setBasico(String basico) {
		this.basico = basico;
	}
	public String getIntermediario() {
		System.out.println("O plano Intermediario tem direito a:");
		return intermediario;
	}
	public void setIntermediario(String intermediario) {
		this.intermediario = intermediario;
	}
	public String getAvancado() {
		
		System.out.println("O plano Avancado tem direito a:");
		return avancado;
	}
	public void setAvancado(String avancado) {
		this.avancado = avancado;
	}
	
	
	

}

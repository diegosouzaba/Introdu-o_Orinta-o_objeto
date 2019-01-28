package com.br.academia.sistema;

public class Planos {
	
	private String basico;
	private String intermediario;
	private String avancado;
	public String getBasico() {
		return basico;
	}
	
	public Planos(String basico, String intermediario, String avancado) {
		super();
		this.basico = basico;
		this.intermediario = intermediario;
		this.avancado = avancado;
	}
	
	public void setBasico(String basico) {
		this.basico = basico;
	}
	public String getIntermediario() {
		return intermediario;
	}
	public void setIntermediario(String intermediario) {
		this.intermediario = intermediario;
	}
	public String getAvancado() {
		return avancado;
	}
	public void setAvancado(String avancado) {
		this.avancado = avancado;
	}
	
	
	

}

package com.br.academia.sistema;

public class Cliente {
	private String nome;
	private String dataNascimento;
	private String cpf;
	private String endereco;
	private static int matricula = 0;
	
	
	
	
	
	public Cliente(String nome, String dataNascimento, String cpf,
			String endereco) {
			super();
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.cpf = cpf;
			this.endereco = endereco;
			Cliente.matricula++;
			
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}

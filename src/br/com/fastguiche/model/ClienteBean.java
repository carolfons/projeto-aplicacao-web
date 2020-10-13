package br.com.fastguiche.model;

import java.time.LocalDate;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClienteBean {

	private String nome;
	private int CPF;
	private String dataNascimento;	
	private String endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void gravar() {
		System.out.println("Gravando cliente "+ this.nome );
	}
}

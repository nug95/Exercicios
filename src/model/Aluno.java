package model;

public class Aluno {
	String nome;
	double nota;
	String contacto;
	
	
	public Aluno(String nome, double nota, String contacto) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.contacto = contacto;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}


	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
}

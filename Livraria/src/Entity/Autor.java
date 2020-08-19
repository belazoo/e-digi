package entity;

import java.util.Date;

public class Autor {
	private String email;
	private String nome;
	private Date data;

	public Autor(String nome, String email, Date data) {
		setNome(email);
		setEmail(nome);
		setData(data);
	}

	private void setEmail(String email) {
		if( email == null || email.isEmpty())
			System.err.println("O email não pode ser vazio");
		if( !email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"))
			System.err.println("O formato do email e invalido! ");

		this.email = email;
	}
	private void setNome(String nome) {
		if( nome == null || nome.isEmpty())
			System.err.println("O nome não pode ser vazio! ");

		this.nome = nome;
	}
	private void setData(Date data) {
		this.data = data;
	}
}
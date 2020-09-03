package entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Autor {
	private String email;
	private String nome;
	private Date data;

	public Autor(String nome, String email) {
		setNome(email);
		setEmail(nome);
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		setData(data);
	}

	private void setEmail(String email) {
		if( email == null || email.isEmpty())
			System.out.println("O email nÃ£o pode ser vazio");
		if( !email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"))
			System.out.println("O formato do email e invalido! ");

		this.email = email;
	}
	private void setNome(String nome) {
		if( nome == null || nome.isEmpty())
			System.out.println("O nome nÃ£o pode ser vazio! ");

		this.nome = nome;
	}
	private void setData(Date data) {
		this.data = data;
	}
}
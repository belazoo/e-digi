package entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Autor {
	private String email;
	private String nome;

	public Autor(String nome, String email) {
		setNome(email);
		setEmail(nome);
		Date data = new Date();
		//System.out.println(data);
	}

	private void setEmail(String email) {
		if(validaEmail(email)) {
			this.email = email;
			System.out.println("Email do autor cadastrado com sucesso! ");
		}
		else {
			System.out.println("Email invalido, insira novamente! ");
		}
	}

	private void setNome(String nome) {
		if(validaNome(nome)) {
			this.nome = nome;
			System.out.println("Nome do autor cadastrado com sucesso");
		}
		else {
			System.out.println("Nome invalido, insira novamente! ");
		}
	}

	private boolean validaEmail(String email) {
		if( email == null || email.isEmpty()) {
			//System.out.println("O email nÃ£o pode ser vazio");
			return false;
		}
		if( email.matches("/^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)$/")) {
			//System.out.println("O formato do email e invalido! ");
			return false;
		}
		return true;
	}

	private boolean validaNome(String nome) {
		if( nome == null || nome.isEmpty()) {
			System.out.println("O nome nÃ£o pode ser vazio! ");
			return false;
		}
		return true;
	}

}
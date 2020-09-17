package entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Autor {
	private String email;
	private String nome;

	public Autor(String nome, String email) {
		try {
			setEmail(email);
			setNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Date data = new Date();
		//System.out.println(data);
	}

	private void setEmail(String email) throws Exception {
		if(validaEmail(email)) {
			this.email = email;
			System.out.println("Email do autor cadastrado com sucesso! ");
		}
		else {
			throw new Exception("Email invalido, insira novamente! ");
		}
	}

	private void setNome(String nome) throws Exception {
		if(validaNome(nome)) {
			this.nome = nome;
			System.out.println("Nome do autor cadastrado com sucesso");
		}
		else {
			throw new Exception("Nome invalido, insira novamente! ");
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

	private boolean validaNome(String nome) throws Exception {
		if( nome == null || nome.isEmpty()) {
			throw new Exception("O nome não pode ser vazio! ");
		}
		return true;
	}

}
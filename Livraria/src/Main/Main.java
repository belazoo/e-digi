package main;

import entity.Autor;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String nome = "fulano";
		String email = "fulano@gmail.com";
		Date data = new Date();
		Autor c = new Autor();
		try {
			c.Autor(nome, email, data);
			System.out.println("O Autor de nome " + nome + "e e-mail" + email + " foi cadastrado com sucesso");
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}

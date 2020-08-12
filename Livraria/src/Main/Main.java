package main;

import entity.Autor;

public class Main {
	public static void main(String[] args) {
		Autor c = new Autor();
		String nome = "fulano";
		String email = "fulano@gmail.com";
		try {
			c.setNome(nome);
			c.setEmail(email);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

package main;

import entity.Autor;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String nome = "fulano";
		String email = "fulano@gmail.com";
		Date data = new Date();
		try {
			Autor a = new Autor(nome, email, data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
package main;

import entity.Autor;
import entity.Categoria;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String nome = "fulano";
		String email = "fulano@gmail.com";
		String nomeCategoria = "Terror";
		Date data = new Date();
		try {
			Categoria c = new Categoria(nomeCategoria, data);
			Autor a = new Autor(nome, email, data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
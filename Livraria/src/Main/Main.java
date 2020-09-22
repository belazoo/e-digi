package main;

import entity.Autor;
import entity.Categoria;

import java.awt.print.Printable;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String nome = "fulano";
		String email = "fulano.fulino@gmail.com.br";
		String nomeCategoria = "Terror";
		try {
			Categoria c = new Categoria(nomeCategoria);
			Autor a = new Autor(nome, email);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
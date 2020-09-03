package main;

import entity.Autor;
import Entity.Categoria;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String nome = "fulano";
		String email = "fulano@gmail.com";
		String nomeCategoria = "Terror";
		Categoria c = new Categoria(nomeCategoria);
		Autor a = new Autor(nome, email);
	}
}
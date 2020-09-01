package main;

import entity.Autor;
import Entity.Categoria;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String nome = "fulano";
		String email = "fulano@gmail.com";
		String nomeCategoria = "Terror";
		try {
			Categoria c = new Categoria(nomeCategoria);
			Autor a = new Autor(nome, email);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
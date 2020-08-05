package main;

import java.util.Scanner;

import control.Controller;

public class Main {
	public static void main(String[] args) {
		Controller c = new Controller();
		String nome = "fulano";
		String email = "fulano@gmail.com";
		try {
			c.cadastro(nome, email);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

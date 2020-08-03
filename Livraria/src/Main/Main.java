package Main;

import java.util.Scanner;

import Control.Controller;

public class Main {
	public static void main(String[] args) {
		Controller c = new Controller();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String nome;
		String email;
		
		System.out.println("Insira o nome do autor: ");
		nome = sc1.next();		
		
		System.out.println("Insira o email do autor: ");
		email = sc2.next();
		
		try {
			c.cadastro(nome, email);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

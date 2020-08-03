package Control;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entity.Autores;

public class Controller {
	Autores autor = new Autores();
	public static final Pattern regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public void cadastro(String nome, String email) {
		Date date = new Date();
		if (nome == null) {
			System.out.println("O nome não pode estar em branco!");
		} if(!verificaEmail(email)) {
				System.out.println("O email não e valido!");
			} if (autor.getEmail() == email){
				System.out.println("O email já esta cadastrado!");
				} else {
					autor.setNome(nome);
					autor.setEmail(email);
					autor.setData(date);
					System.out.println("O Autor: " + nome + "\n Email: " + email + "\n foi cadastrado com sucesso!");
				}
	}
	
	public static boolean verificaEmail(String email) {		
		Matcher matcher = regex.matcher(email);
		return matcher.find();
	}
}

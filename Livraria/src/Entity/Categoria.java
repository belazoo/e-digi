package entity;

import java.util.Date;

public class Categoria {
    private String nome;
    private Date data;

    public Categoria(String nome, Date data) {
        setNome(nome);
        setData(data);
        System.out.println("Categoria cadastrada com sucesso! ");
    }

    public void setNome(String nome) {
        if( nome == null || nome.isEmpty())	System.err.println("O nome não pode ser vazio! ");

        this.nome = nome;
    }

    public void setData(Date data) {
        this.data = data;
    }


}
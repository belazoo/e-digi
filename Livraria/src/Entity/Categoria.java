package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Categoria {
    private String nome;
    private Date data;

    public Categoria(String nome) {
        setNome(nome);
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        setData(data);
    }

    public void setNome(String nome) {
        if( nome == null || nome.isEmpty())
            System.out.println("O nome não pode ser vazio! ");
        else {
            this.nome = nome;
            System.out.println("Categoria cadastrada com sucesso! ");
        }
    }

    public void setData(Date data) {
        this.data = data;
    }


}
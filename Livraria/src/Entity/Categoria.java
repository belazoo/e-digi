package Entity;

import java.util.Date;

public class Categoria {
    private String nome;
    private Date data;

    public Categoria(String nome) {
        setNome(nome);
        setData(data);
    }

    public void setNome(String nome) {
        if( nome == null || nome.isEmpty())
            System.err.println("O nome não pode ser vazio! ");
        else {
            this.nome = nome;
            System.out.println("Categoria cadastrada com sucesso! ");
        }
    }

    public void setData(Date data) {
        this.data = data;
    }


}
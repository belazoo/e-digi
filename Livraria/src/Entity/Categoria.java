package entity;

import java.util.Date;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Categoria {
    private String nomeCategoria;

    public Categoria(String nomeCategoria) {
        try {
            setNomeCategoria(nomeCategoria);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Date data = new Date();
        //System.out.println(data);
    }

    public void setNomeCategoria(String nomeCategoria) throws Exception {
        if(validaCategoria(nomeCategoria)) {
            this.nomeCategoria = nomeCategoria;
            System.out.println("Categoria cadastrada com sucesso! ");
        } else {
            throw new Exception("Categoria invalida, insira novamente");
        }
    }

    private Boolean validaCategoria(String nomeCategoria) {
        if( nomeCategoria == null || nomeCategoria.isEmpty())
            //System.out.println("O nome da categoria não pode ser vazio! ");
            return false;
        return true;

    }

}
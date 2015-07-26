package Contatos;

import java.util.List;

/**
 * Created by Unipar on 25/07/2015.
 */
public class EntidadeContatos {
    private int id;
    private String nome;
    private List<EntidadeTelefone> Telefones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EntidadeTelefone> getTelefones() {
        return this.Telefones;
    }

    public void setTelefones(
         List<EntidadeTelefone> telefones) {
        this.Telefones = telefones;
    }

    @Override
    public String toString() {
     return nome + " - " + getTelefones();
    }
}

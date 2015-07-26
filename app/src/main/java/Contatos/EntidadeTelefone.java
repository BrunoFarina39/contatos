package Contatos;

/**
 * Created by Unipar on 25/07/2015.
 */
public class EntidadeTelefone {
    private String Telefone;

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return " - "+Telefone;
    }
}

package models;
import java.util.Objects;

public class Vaga {
    private String id;
    boolean disponivel;
    public Vaga(char fila, int numero) {
        this.disponivel = true;
        this.id = fila + String.valueOf(numero);
    }
    public Vaga(char fila, int numero, boolean disponivel) {
        this.disponivel = disponivel;
        this.id = fila + String.valueOf(numero);
    }

    public boolean estacionar() {
        this.disponivel = false;

        return this.disponivel;
    }

    public boolean sair() {
        this.disponivel = true;

        return this.disponivel;
    }

    public boolean disponivel() {
        return this.disponivel;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vaga)) {
            return false;
        }
        Vaga vaga = (Vaga) o;
        return Objects.equals(id, vaga.id) && disponivel == vaga.disponivel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, disponivel);
    }

    @Override
    public String toString() {
        return getId()  + "%" + disponivel;
    }

}
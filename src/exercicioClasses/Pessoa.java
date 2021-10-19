package exercicioClasses;



import java.util.Objects;

public class Pessoa {
    String nome;
    double peso;

    public Pessoa(){

    }

    public Pessoa(String nome, double peso){
        this.nome=nome;
        this.peso=peso;
    }

    public void comer(Comida comida){
        this.peso+= comida.peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Double.compare(pessoa.peso, peso) == 0 && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, peso);
    }
}

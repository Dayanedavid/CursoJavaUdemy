package desafios.classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome){
        this.nome=nome;
    }

    public Cliente(String nome, List<Compra> compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public void addCompra(Compra compra){
        this.compras.add(compra);
    }


    public double obterValorTotal(){
        int total=0;
        for(Compra compra:compras){
            total+=compra.obterValorTotal();
        }
        return total;
    }
}

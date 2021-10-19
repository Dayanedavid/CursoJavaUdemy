package desafios.classes;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    public void addItem(Item item){
        this.itens.add(item);
    }

    public double obterValorTotal(){
        double total=0;

        for(Item item: itens){
            total+=item.qtd * item.produto.preco;
        }
        return total;
    }
}

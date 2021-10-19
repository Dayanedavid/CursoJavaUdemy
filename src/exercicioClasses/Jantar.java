package exercicioClasses;

public class Jantar {
    public static void main(String[] args) {

        Comida c1= new Comida("Feijão",1.50);
        Comida c2= new Comida("Arroz",2.00);
        Comida c3= new Comida("Bifé",5.00);

        Pessoa p1= new Pessoa("Denis",84);
        Pessoa p2= new Pessoa("Jefferson",81.5);

        System.out.println(p1.nome);
        System.out.println(p1.peso);
        p1.comer(c1);
        System.out.println(p1.peso);

        System.out.println();

        System.out.println(p2.nome);
        System.out.println(p2.peso);
        p2.comer(c3);
        System.out.println(p2.peso);
    }
}

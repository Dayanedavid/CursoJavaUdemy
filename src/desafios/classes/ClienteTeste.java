package desafios.classes;

public class ClienteTeste {
    public static void main(String[] args) {
        Produto produto1= new Produto("Bola de futebol", 55.00);
        Produto produto2= new Produto("Raquete", 20.00);
        Produto produto3= new Produto("Colete", 30.00);

        Item item1= new Item(1,produto1);
        Item item2= new Item(2,produto2);
        Item item3= new Item(3,produto3);

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.addItem(item1);
        compra1.addItem(item2);
        compra2.addItem(item3);

        Cliente cliente= new Cliente("Denis");
        cliente.addCompra(compra1);
        cliente.addCompra(compra2);

        System.out.println("Valor Total da compra: " + cliente.obterValorTotal());
    }
}

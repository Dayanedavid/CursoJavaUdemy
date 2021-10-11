package desafios;

public class Aula47 {
    public static void main(String[] args) {

        boolean trabalho1=true;
        boolean trabalho2=false;

        String tv50= trabalho1 && trabalho2 ? "Vamos comprar a Tv de 50 Polegadas":"Não vamos comprar a Tv de 50";
        System.out.println(tv50);

        String tv32= trabalho1 || trabalho2 ? "Vamos comprar a Tv de 32 Polegadas":"Não vamos comprar a Tv de 32";
        System.out.println(tv32);

        String sorvete= trabalho1 ^ trabalho2 ? "Vamos tomar sorvete" : "Vamos ficar em casa hoje";
        System.out.println(sorvete);
    }
}

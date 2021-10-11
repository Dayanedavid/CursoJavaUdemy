package exerciciosConceitosBasicos.Ex4;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor");
        double valor = scan.nextDouble();

        double quadrado = Math.pow(valor,2);
        double cubo = Math.pow(valor,3);

        System.out.println("Valor digitado: " + valor);
        System.out.println("Valor ao quadrado: " + quadrado);
        System.out.println("Valor ao cubo: " + cubo);

        scan.close();

    }
}

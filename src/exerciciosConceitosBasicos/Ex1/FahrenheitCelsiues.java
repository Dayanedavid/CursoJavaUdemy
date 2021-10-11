package exerciciosConceitosBasicos.Ex1;

import java.util.Scanner;

public class FahrenheitCelsiues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em Fahrenheit ");
        double valor = scan.nextDouble();

        double resultado = 1.8*valor+32;

        System.out.printf("O valor em Celsius é %.1fº%n", resultado);

        scan.close();
    }
}

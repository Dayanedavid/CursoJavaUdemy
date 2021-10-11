package exerciciosConceitosBasicos.Ex2;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em Celsius ");
        double valor = scan.nextDouble();

        double resultado = (valor-32)*5/9;

        System.out.printf("O valor em Fahrenheit é %.1fº%n", resultado);

        scan.close();
    }
}

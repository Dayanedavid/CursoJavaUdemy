package exerciciosConceitosBasicos.Ex3;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        System.out.println("Digite sua peso");
        double peso = scan.nextDouble();

        double resultado = peso/Math.pow(altura,2);

        System.out.printf("O seu IMC é %.2f%n",resultado);

        scan.close();
    }
}

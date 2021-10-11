package exerciciosConceitosBasicos.Ex5;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo em cm");
        double altura = scan.nextDouble();

        System.out.println("Digite a base do triângulo em cm");
        double base = scan.nextDouble();

        double resultado = (base*altura)/2;

        System.out.println("A área do triângulo é " + resultado + "cm²");

        scan.close();
    }
}

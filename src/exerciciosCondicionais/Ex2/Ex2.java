package exerciciosCondicionais.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        int bissexto = ano % 4;

        if (bissexto == 0) {
            System.out.println(ano + " é um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
        scan.close();
    }
}

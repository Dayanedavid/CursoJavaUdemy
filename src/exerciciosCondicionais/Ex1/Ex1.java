package exerciciosCondicionais.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = scan.nextInt();

        if(numero>=0 && numero<=10){
            System.out.println("Número entre 0 e 10");
        } else {
            System.out.println("Número não está entre 0 e 10");
        }

        if(numero%2==0){
            System.out.println("O número é par");
        } else{
            System.out.println("O número é impar");
        }

        scan.close();

    }
}

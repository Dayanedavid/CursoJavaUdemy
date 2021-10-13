package exerciciosCondicionais.Ex6;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random radom = new Random();
        int numero =radom.nextInt(100);

        System.out.println(numero);
        System.out.println("ADIVINHE O NÚMERO SORTEADO");
        for(int i=1; i<=10; i++){
            System.out.println(i+ "° tentativa");
            int num= scan.nextInt();

            if(num==numero){
                System.out.println("Parabéns, você acertou!!");
                System.out.println("Número sorteado: " + numero);
            } else {
                System.out.println("Número errado");
                System.out.println("Restam "+ (10-i) + " tentativas");
            }
        }
        scan.close();
    }
}

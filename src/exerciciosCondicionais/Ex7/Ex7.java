package exerciciosCondicionais.Ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma=0;
        int num;

        do{
            System.out.println("Digite um número inteiro");
            num = scan.nextInt();

            if(num>0){
                soma+=num;
            }

        }while(num>0);

        System.out.println("Soma dos valores: " + soma );

        scan.close();
    }
}

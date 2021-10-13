package exerciciosCondicionais.Ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = scan.nextInt();

        for(int i=1; i<num; i++){
            if(i != 1 && num%i==0){
                System.out.println("Não é um número primo");
                break;
            } else {
                System.out.println("É um número primo");
                break;
            }
        }
        scan.close();
    }
}

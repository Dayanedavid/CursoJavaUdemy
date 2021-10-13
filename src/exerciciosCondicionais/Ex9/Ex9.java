package exerciciosCondicionais.Ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int maior=0;

        for(int i=1; i<=51; i++){
            System.out.println("Digite o " + i + "° número");
            int num = scan.nextInt();

            if(num>maior){
                maior=num;
            }
        }
        System.out.println("O maior número é " + maior);
        scan.close();
    }
}

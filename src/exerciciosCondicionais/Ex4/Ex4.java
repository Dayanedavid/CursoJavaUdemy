package exerciciosCondicionais.Ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();

        double notaMedia = nota1+nota2/2;

        if(notaMedia>=7){
            System.out.println("Aprovado");
        } else if (notaMedia<7 && notaMedia>4){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        scan.close();
    }
}

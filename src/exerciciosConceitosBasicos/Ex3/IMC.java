package exerciciosConceitosBasicos.Ex3;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        System.out.println("Digite seu peso");
        double peso = scan.nextDouble();

        double resultado = peso/Math.pow(altura,2);

        if (resultado < 18.5 ){
            System.out.println("Você esta abaixo do peso, precisa comer um saco de feijão");

        } else if (resultado > 18.5 && resultado < 24.9) {
            System.out.println("Você esta normal, não faz mais que sua obrigação");
        } else if (resultado > 25.0 && resultado < 29.9){
            System.out.println("Não é sobrepeso, é sobre isso e ta tudo bem");
        } else if (resultado > 30.0 && resultado < 34.9){
            System.out.println("Você é obesidade grau 1, necessita de dieta");
        } else if (resultado > 35.0 && resultado < 39.9){
            System.out.println("Você é obesidade grau 2");
        } else if (resultado > 40) {
            System.out.println("Voce é obesidade morbida, não anda, se nao a terra treme");
        }
        System.out.printf("O seu IMC é %.2f%n",resultado);

        scan.close();
    }
}

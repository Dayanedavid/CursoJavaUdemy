package desafios;

import java.util.Scanner;

public class Aula56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        double num1= scan.nextDouble();

        System.out.println("Digite um numero");
        double num2= scan.nextDouble();

        System.out.println("Digite uma operação (+ - / *)");
        String x= scan.next();

        scan.close();

        //Operador ternário
        double resultado= "+".equals(x)? num1+num2 : 0;
        resultado= "-".equals(x)? num1-num2 : resultado;
        resultado= "*".equals(x)? num1*num2 : resultado;
        resultado= "/".equals(x)? num1/num2 : resultado;

        //Para formatar o saída
        System.out.printf("%.2f %s %.2f = %.2f", num1,x,num2, resultado);


    }
}

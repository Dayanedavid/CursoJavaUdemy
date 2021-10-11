package exerciciosConceitosBasicos.Ex6;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("FORMULA DE BHASKARA");
        System.out.println("Digite o a:");
        double a = sc.nextDouble();
        System.out.println("Digite o b:");
        double b = sc.nextDouble();
        System.out.println("Digite o c:");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2.0) -4 * a * c;

        String v = delta<0 || a==0 ? "Impossivél calcular" : "Calculando...";
        System.out.println(v);

        double r1 = (- b - (Math.sqrt(delta))/(2*a));
        double r2 = (- b + (Math.sqrt(delta))/(2*a));

        System.out.println("x' = " + r1);
        System.out.println("x'' = " + r2);
        sc.close();
    }
}

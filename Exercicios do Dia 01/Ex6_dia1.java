package PacoteJava;

import java.util.Scanner;

public class Ex6_dia1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner (System.in);

        double x1,x2,y1,y2,d,potencia1,potencia2;

        System.out.println("Informe o valor de x1: ");
        x1 = leia.nextDouble();
        System.out.println("Informe o valor de x2: ");
        x2 = leia.nextDouble();
        System.out.println("Informe o valor de y1: ");
        y1 = leia.nextDouble();
        System.out.println("Informe o valor de y2: ");
        y2 = leia.nextDouble();


        potencia1 = Math.pow((x2-x1), 2);
        potencia2 = Math.pow((y2-y1), 2);

        d = Math.sqrt(potencia1 + potencia2);

        System.out.println("Resultado: " + d);

    }

}
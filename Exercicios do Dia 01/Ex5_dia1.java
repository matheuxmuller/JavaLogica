package PacoteJava;

import java.util.Scanner;

public class Ex5_dia1 {

    public static void main (String[] args) {
        

        double n1,n2,n3,media;
        Scanner leia=new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        n1=leia.nextDouble();

        System.out.println("Digite a nota 2: ");
        n2=leia.nextDouble();

        System.out.println("Digite a nota 3: ");
        n3=leia.nextDouble();

        media=((n2)+ (n3) + (n1*5))/10;

        System.out.println("A média é: " + media);


    }

}
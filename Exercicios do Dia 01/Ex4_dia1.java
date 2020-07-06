package PacoteJava;

import java.util.Scanner;

public class Ex4_dia1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leitura  = new Scanner (System.in);
        double d,r,s;
        int a,b,c;


        System.out.println("Digite um valor pra A: ");
        a = leitura.nextInt();

        System.out.println("Digite um valor pra B: ");
        b = leitura.nextInt();

        System.out.println("Digite um valor pra C: ");
        c = leitura.nextInt();

        r = Math.pow((a+b), 2);
        s = Math.pow((b+c), 2);

        d = (r + s) /2;

        System.out.println("Resultado de D: "+ d);


    }

}
package PacoteJava2;

import java.util.Scanner;

public class Ex1_dia2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);


        int num1,num2,num3, maior = 0;

        System.out.println("Informe o numero 1: ");
        num1 = leia.nextInt();
        System.out.println("Informe o numero 2: ");
        num2 = leia.nextInt();
        System.out.println("Informe o numero 3: ");
        num3 = leia.nextInt();

        if (num1 > num2)
        {
            maior = num1;
        }
        
        else
        {
            maior = num2;
        }
        
        if(num3 > maior) 
        {
            maior = num3;
        }

        System.out.println("Numero maior: " + maior);


    }

}
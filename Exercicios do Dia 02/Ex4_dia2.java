package PacoteJava2;

import java.util.Scanner;

public class Ex4_dia2 {

    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int num;
        double raiz, potencia;

        System.out.println("Informe o numero");
        num = leia.nextInt();

        if (num % 2 == 0)
        {
            raiz = Math.sqrt(num);
            System.out.println("Numero " + num + " � par e sua raiz quadrada �: " + raiz);
        }
        
        else
        {
            potencia = Math.pow(num, 2);
            System.out.println("Numemro " + num + " � impar e elevado a dois �: " + potencia);
        }
    }

}
package PacoteJava2;

import java.util.Scanner;

public class Ex2_dia2 {
    public static void main (String args[])
    {

        Scanner entrada = new Scanner (System.in);
        int n1, n2, n3, pri=0, seg=0, ter=0;

        System.out.printf("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        System.out.printf("Digite o segundo numero: ");
        n2 = entrada.nextInt();
        System.out.printf("Digite o terceiro numero: ");
        n3 = entrada.nextInt();

        if(n1>n2 && n1>n3)
        {
            if(n2>n3)
            {
                ter = n1;
                seg = n2;
                pri = n3;
            }
            else
            {
                ter = n1;
                seg = n3;
                pri = n2;
            }

        }
        else if(n2>n1 && n2>n3)
        {
            if(n1>n3)
            {
                ter = n2;
                seg = n1;
                pri = n3;
            }
            else
            {
                ter = n2;
                seg = n3;
                pri = n1;
            }
        }
        else if(n3>n1 && n3>n2)
        {
            if(n1>n2)
            {
                ter = n3;
                seg = n1;
                pri = n2;
            }
            else
            {
                ter = n3;
                seg = n2;
                pri = n1;
            }
        }

        System.out.println("\nOs numeros em ordem crescente s�o: ");
        System.out.println("\nPrimeiro "+pri);
        System.out.println("\nSegundo " +seg);
        System.out.println("\nTerceiro "+ter);

    }


}
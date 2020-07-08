package JavaDia3;

import java.util.Scanner;

public class Ex3_dia3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade, menor = 0, maior = 0;

        System.out.println("Informe a idade");
        idade = leia.nextInt();

        while(idade != -99)
        {
        	if (idade < 21)
        	{
            menor++;
            }
            if(idade > 50) 
            {
            maior++;
            }
            System.out.println("Informe a idade");
            idade = leia.nextInt();
            }

        System.out.println("Menores de 20 anos: " + menor);
        System.out.println("Maior de 50 anos: " + maior);


}

}
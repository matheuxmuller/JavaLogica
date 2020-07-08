package JavaDia3;

import java.util.Scanner;

public class Ex4_dia3

{
	
	public static void main(String srgs[])
	{
        Scanner leia = new Scanner (System.in);
        int idade, sexo, humor, contpc=0, contmn=0, contha=0, contpnmaior=0, contpcmenor=0, x=1;

        while (x <= 3)
        {
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();
            
            System.out.println("Digite seu sexo, sendo 1 para feminino, 2 para masculino: ");
            sexo = leia.nextInt();
            
            System.out.println("Qual o seu humor? Digite 1 para calma, 2 para nervosa e 3 para agressiva: ");
            humor = leia.nextInt();
            

            if(humor == 1)
            {
            	contpc++;
            }
            if(sexo == 1 && humor == 2)
            {
            	contmn++;
            }
            if(sexo == 2 && humor == 3)
            {
            	contha++;
            }
            if(humor == 2 && idade > 40)
            {
            	contpnmaior++;
            }
            if(humor == 1 && idade < 18)
            {
            	contpcmenor++;
            }
            x++;
        }
        
        System.out.println("o número de pessoas calmas é:" + contpc);
        System.out.println("o número de mulheres nervosas é:" + contmn);
        System.out.println("o número de homens agressivos é:" + contha);
        System.out.println("o número de pessoas nervosas com mais de 40 anos:" + contpnmaior);
        System.out.println("o número de pessoas calmas com menos de 18 anos:" + contpcmenor);
}
}

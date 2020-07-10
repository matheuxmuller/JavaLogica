package JavaDia5;

import java.util.Scanner;

public class Ex1_dia5 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int condicao=0, preco=0;
        double valorfinal=0;

        System.out.println("Entre com o preco da peça");
        preco = leia.nextInt();
        
        System.out.println("Informe a forma de pagamento: \n(1) a vista em dinheiro, \n(2) a vista no cartão, \n(3) em 2x sem juros, \n(4) em 3x com juros");
        condicao = leia.nextInt();

        	if (condicao==1)
        	{
        		valorfinal= preco - (preco*0.20);
        		System.out.println("Valor final obteve desconto de 20% e corresponde a R$: "+valorfinal);
            }
            if(condicao==2) 
            {
            	valorfinal= preco - (preco*0.15);
        		System.out.println("Valor final obteve desconto de 15% e corresponde a R$: "+valorfinal);
            }
            if(condicao==3) 
            {
            	System.out.println("Valor final não obteve desconto e corresponde a R$: "+preco);
            }
            if(condicao==4) 
            {
            	valorfinal= preco + (preco*0.10);
        		System.out.println("Valor final teve acréscimo de 10% e corresponde a R$: "+valorfinal);
            }
            
        }
}


package JavaDia4;

import java.util.Scanner;

public class Ex4_dia4_Tentativa1 {
	
	public static void main (String args[])
	{	
		Scanner leia = new Scanner (System.in);
		
		float [][] m1 = new float [2][2];
		float [][] m2 = new float [2][2];
		float [][] somaMat = new float [2][2];
		float [][] subMat = new float [2][2];
		int l=0, c=0, opcao, constante;
		
		for (l=0; l < m1.length; l++)
		{
			for (c=0; c < m1.length; c++)
			{
				System.out.println("Entre com os valores da primeira matriz: ");
				m1 [l][c]= leia.nextFloat();
			}
		}
		
		for (l=0; l < m2.length; l++)
		{
			for (c=0; c < m2.length; c++)
			{
				System.out.println("Entre com os valores da segunda matriz: ");
				m2 [l][c]= leia.nextFloat();
			}
		}

		System.out.println("Selecione uma opção: \n1 para somar, \n2 para subtrair, \n3 para adicionar uma constante, \n4 para imprimir");
		opcao = leia.nextInt();
		
		if(opcao == 1)
		{
			for (l=0; l < somaMat.length; l++)
			{
				for (c=0; c < somaMat.length; c++)
				{
					somaMat[l][c] = m1[l][c]+m2[l][c];
				}
			}
            System.out.println("\nA soma das matrizes resulta em: \n");
			for(l=0; l<somaMat.length;l++)
			{
				for(c=0; c<somaMat.length;c++)
				{				
					System.out.printf(somaMat[l][c]+"|");
				}
			}
		}
		
		if(opcao == 2)
		{
			for (l=0; l < subMat.length; l++)
			{
				for (c=0; c < subMat.length; c++)
				{
					subMat[l][c] = m1[l][c]-m2[l][c];
				}
			}
            System.out.println("\nA subtração das matrizes resulta em: \n");
			for(l=0; l<subMat.length;l++)
			{
				for(c=0; c<subMat.length;c++)
				{				
					System.out.printf(subMat[l][c]+"|");
				}
			}
		}
		
		 if(opcao == 3)
         {
			System.out.println("\nEntre com o valor da constante: ");
			constante = leia.nextInt();
			
			for(l=0; l<m1.length;l++)
			{
				for(c=0; c<m1.length;c++)
				{				
					m1[l][c]=m1[l][c]+constante;
					System.out.printf(m1[l][c]+"|");
				}
			}
			for(l=0; l<m2.length;l++)
			{
				for(c=0; c<m2.length;c++)
				{				
					m2[l][c]=m2[l][c]+constante;
					System.out.printf(m2[l][c]+"|");
				}
			}
	      }
		 
         if(opcao == 4)
         {
			System.out.println("\nA Matriz 1 é: \n");
			for(l=0; l<m1.length;l++)
			{
				for(c=0; c<m1.length;c++)
				{				
				System.out.printf(m1[l][c]+"|");
				}
			}
			System.out.println("\nA Matriz 2 é: \n");
			for(l=0; l<m2.length;l++)
			{
				for(c=0; c<m2.length;c++)
				{				
				System.out.printf(m2[l][c]+"|");
				}
			}
	      }
}
}
package JavaDia5;

import java.util.Scanner;

public class Ex2_dia5 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float peso=0, altura=0;
        double imc=0;
        
        System.out.println("Informe seu peso atual: ");
        peso = leia.nextFloat();
        
        System.out.println("Informe sua altura atual: ");
        altura = leia.nextFloat();
        
        imc= peso/(altura*altura);
        System.out.println("Seu IMC é: "+imc);
        
        if (imc < 18.5)
        {
        	System.out.println("Você está baixo do peso");
        }
        if (imc >= 18.5 && imc <= 25)
        {
        	System.out.println("Você está com o peso normal");
        }
        if (imc >= 25 && imc <= 30)
        {
        	System.out.println("Você está acima do peso");
        }
        if (imc > 30)
        {
        	System.out.println("Você está obeso");
        }  
}
}

package JavaDia3;
import java.util.Scanner;

public class Ex2_dia3 {

    public static void main(String[] args) {
    	
    	Scanner leia = new Scanner(System.in);
        int num, somapar=0, somaimpar=0;
        
        System.out.println("Informe um número: ");
        num = leia.nextInt();
        
        for (num = 0; num <=10; num++)
        {
        if (num%2 == 0) 
        {
                System.out.println("O numero " + num + " é par");
                somapar++;
        }
        else
        {
            	System.out.println("O numero " + num + " é impar");
            	somaimpar++;
        }
}
}
}
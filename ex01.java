import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é divisível por 10,por 5 ou por 2:");
        double num = s.nextDouble();

        if((num % 10) ==0 ){
            System.out.println("Divisível por 10");
        }
        else
           if ((num % 5) ==0) {
            System.out.println( "Divisível por 5");
        }
        else
            if ((num % 2) == 0) {
            System.out.println( "divisível por 2 ");
        }
         else 
             System.out.println("Não é divisível por nenhum deles.");
    }
}
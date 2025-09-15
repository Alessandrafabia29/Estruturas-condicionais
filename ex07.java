import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
           Scanner s = new Scanner(System.in);

           System.out.println("Digite um número para descobrir se ele é par ou ímpar:");
           int num = s.nextInt();

         if(num % 2 == 0) {
            System.out.println("Esse número é par.");
           }else{
            System.out.println("Esse número é ímpar.");
           }
    }
    
}

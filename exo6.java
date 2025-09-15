import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class exo6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número para ver o correspondente dia da semana:");
        int num = s.nextInt();

        if(num ==1){
            System.out.println("Domingo");
        }else
         if(num ==2){
            System.out.println("Segunda-feira");
        }else
         if(num ==3){
            System.out.println("Terça-feira");
        }else
         if(num ==4){
            System.out.println("Quarta-feira");
        }else
         if(num ==5){
            System.out.println("Quinta-feira");
        }else
         if(num ==6){
            System.out.println("Sexta-feira");
        }else 
         if(num ==7){
            System.out.println("Sábado");
        } else{
            System.out.println("Não existe correspondência.");
        }

    }
}
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = s.nextInt();

        if (idade == 1){
            System.out.println("Um ano");
        }else
         if (idade == 2){
            System.out.println("Dois anos");
        }else
         if (idade == 10){
            System.out.println("Dez anos");
        }

    }
}

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade em anos para saber quantos dias você tem :");
        int idade = s.nextInt();
        int dias = idade * 365;

        System.out.println("Você possui " + dias + " dias.");

    }
}

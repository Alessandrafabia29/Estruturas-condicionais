import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        System.out.println("Informe sua idade:");
        int idade = s.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor");
        }else 
             if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório");
        }else
             if (idade >= 16 && idade <=17 ) {
            System.out.println("Eleitor facultativo");
        }else
             if ( idade > 65) {
            System.out.println("Eleitor facultativo");
        }



    }
}
    


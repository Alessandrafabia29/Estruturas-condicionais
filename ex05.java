import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu prato principal:");
        System.out.println("1- Vegetariano");
        System.out.println("2- Peixe");
        System.out.println("3- Frango");
        System.out.println("4- Carne");
        int prato = s.nextInt();

        System.out.println("Informe a sobremesa:");
        System.out.println("1- Abacaxi");
        System.out.println("2- Sorvete diet");
        System.out.println("3- Mousse diet");
        System.out.println("4- Mousse de chocolate");
        int sobremesa = s.nextInt();

        System.out.println("Informe a bebida:");
        System.out.println("1- Chá");
        System.out.println("2- Suco de laranja");
        System.out.println("3- Suco de melão");
        System.out.println("4- Refri diet");
        int bebida = s.nextInt();

        int calorias = 0;

        if(prato == 1){
            calorias = calorias + 180;
        }else
         if(prato == 2){
            calorias = calorias + 230;
        }else
         if(prato == 3){
            calorias = calorias + 250;
        }else
         if(prato == 4){
            calorias = calorias + 3500;
        }


        if(sobremesa == 1){
            calorias = calorias + 75;
        }else
         if(prato == 2){
            calorias = calorias + 110;
        }else
         if(prato == 3){
            calorias = calorias + 170;
        }else
         if(prato == 4){
            calorias = calorias + 200;
        }

        
        if(bebida == 1){
            calorias = calorias + 20;
        }else
         if(prato == 2){
            calorias = calorias + 70;
        }else
         if(prato == 3){
            calorias = calorias + 100;
        }else
         if(prato == 4){
            calorias = calorias + 65;
        }

    System.out.println("Você vai consumir " + calorias + "calorias.");
          

    }
    
}

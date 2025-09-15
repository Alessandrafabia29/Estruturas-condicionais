import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o número 1");
        int n1 = s.nextInt();
        System.out.println("Informe o número 2");
        int n2 = s.nextInt();
        System.out.println("Informe o número 3");
        int n3 = s.nextInt();
        System.out.println("Informe o número 4");
        int n4 = s.nextInt();
        System.out.println("Informe o número 5");
        int n5 = s.nextInt();

        int media = (n1 + n2 + n3 + n4 + n5) /5;
        System.out.println("A média é :" + media);

        if(n1 > media){
            System.out.println("Números maiores que a média\n" +n1);
        }
         if(n2 > media){
            System.out.println("Números maiores que a média\n" +n2);
        }
         if(n3 > media){
            System.out.println("Números maiores que a média\n"+n3);
        }
         if(n4 > media){
            System.out.println("Números maiores que a média\n"+n4);
        }
         if(n5 > media){
            System.out.println("Números maiores que a média\n"+n5);
        }




    }
    
}

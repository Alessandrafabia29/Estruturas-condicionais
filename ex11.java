import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a nota1");
        double n1 = s.nextDouble();
        System.out.println("Informe a nota2");
        double n2 = s.nextDouble();
        System.out.println("Informe a nota3");
        double n3 = s.nextDouble();

        System.out.println("Informe o tipo de média:[1]Média Aritmética  [2]Média Ponderada");
        int tipo = s.nextInt();
        double media = 0;

        if (tipo == 1){
            media = (n1+n2+n3) /3;
        }
        else
            if(tipo == 2) {
                System.out.println("Informe o peso da nota1");
                double p1 = s.nextDouble();
                System.out.println("Informe o peso da nota2");
                double p2 = s.nextDouble();
                System.out.println("Informe o peso da nota3");
                double p3 = s.nextDouble();
                media = n1*p1 + n2*p2 + n3*p3;
        }
        else{
            System.out.println("Opção inválida");
            media = 0;
        }
          System.out.println("A media é: " + media) ;     
        }        

    }



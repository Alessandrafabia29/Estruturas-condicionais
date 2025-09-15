import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a nota1");
        double n1 = s.nextDouble();
        System.out.println("Informe a nota2");
        double n2 = s.nextDouble();
        System.out.println("Informe a nota3");
        double n3 = s.nextDouble();
        System.out.println("Informe a nota4");
        double n4 = s.nextDouble();
        double media = (n1 + n2 + n3 + n4)/4;

        if(media >=7) {
            System.out.println("Sua média é:" + media + "Você está APROVADO.");
        }else {
            System.out.println("Sua média é:" + media + "\nVocê está em Exame.");
                System.out.println("informe sua nota do exame");
                   double notaExame = s.nextDouble();
                   double NovaMedia = 0;
                   NovaMedia = (notaExame + media) / 2;

                        if (NovaMedia >= 5){
                      System.out.println("Sua NovaMedia é:" + NovaMedia + "\nAprovado com exame");
                      }else 
                          if(NovaMedia < 5){
                        System.out.println("Sua NovaMedia é:" + NovaMedia + "\nReprovado");
                          }
                 }
           }
    }


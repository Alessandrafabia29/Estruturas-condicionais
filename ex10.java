import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe sua quantidade de peixe em kilos");
        double kilo = s.nextDouble();
        double multa = 4.0;
        double valorPagar  ;
        
         if (kilo <= 500 ) {
            System.out.println("Não há multa por excedente.");
        }else
            if(kilo > 500){
                double excessokg = (kilo - 500); 
                valorPagar = excessokg * multa;
                System.out.println("Você excedeu o limite. Valor a pagar é:" + valorPagar);
                
            }



    }
}

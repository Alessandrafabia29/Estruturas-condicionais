import java.util.Scanner;
public class ex03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu saldo médio:");
        double saldoMedio = s.nextDouble();
        double credito = 0;

        if(saldoMedio >= 0 && saldoMedio <=500) {
            System.out.println("Seu saldo médio é:" + saldoMedio + "\n Nenhum crédito");
        }else
         if(saldoMedio >= 501 && saldoMedio <=1000) {
            credito = (saldoMedio * 0.30);
            System.out.println("Seu saldo médio é:" + saldoMedio + "\nSeu crédito é: " + credito);
        }else 
           if(saldoMedio >= 1001 && saldoMedio <=3000) {
            credito = (saldoMedio * 0.40);
            System.out.println("Seu saldo médio é:" + saldoMedio + "\nSeu crédito é: " + credito);
        }else 
           if(saldoMedio >= 3001) {
            credito = (saldoMedio * 0.50);
            System.out.println("Seu saldo médio é:" + saldoMedio + "\nSeu crédito é: " + credito);
        }
    
}
}
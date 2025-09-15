
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite seu peso em kg:");
        double peso = s.nextDouble();
        System.out.println("Digite sua altura em metros:");
        double altura = s.nextDouble();
        double imc = peso / (altura * altura);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Seu IMC é: "  + df.format(imc) ); /*2 linhas para apresentar na tela o IMC para usuário */


        if (imc < 18.5) {
            System.out.println("Classificação:Magreza  Nível de obesidade:0");
        }else
            if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação:Normal  Nível de obesidade:0");
        }else
            if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação:Sobre peso  Nível de obesidade:1");
        }else
             if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação:Obesidade  Nível de obesidade:1");
        }else
              if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação:Obesidade  Nível de obesidade:2");
        }else
              if (imc >= 40) {
            System.out.println("Classificação:Obesidade  Nível de obesidade:3");
        }

            
        
    }
}
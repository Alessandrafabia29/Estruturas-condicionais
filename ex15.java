import java.util.Scanner;
public class ex15 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a medida do cateto oposto");
        double cOposto = s.nextDouble();
        System.out.println("Informe a medida do cateto adjacente");
        double cAdjacente = s.nextDouble();
        System.out.println("Informe a medida da hipotenusa");
        double hipotenusa = s.nextDouble();

        if(Math.pow(hipotenusa,2)== (Math.pow(cOposto,2) + Math.pow(cAdjacente,2))){
            System.out.println("É um triângulo retângulo");
        }else
            System.out.println("Não é um triângulo retângulo");

    }
    
}

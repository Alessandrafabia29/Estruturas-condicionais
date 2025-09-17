import java.util.Scanner;

public class ex16 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe os valores referentes ao ponto 1");
        System.out.println("Informe x1");
        double dx1 = s.nextDouble();
        System.out.println("Informe y1");
        double dy1 = s.nextDouble();

        System.out.println("Informe os valores referentes ao ponto 2");
        System.out.println("Informe x2");
        double x2 = s.nextDouble();
        System.out.println("Informe y2");
        double y2 = s.nextDouble();

        if(dx1 < x2){
            double distancia = Math.sqrt(Math.pow((x2 - dx1),2)+ Math.pow((y2 - dy1),2));
            System.out.println("A distância entre os dois pontos é:" + distancia);
        }
        else
            System.out.println("Não é possível calcular pois p1 > p2");

    }
}

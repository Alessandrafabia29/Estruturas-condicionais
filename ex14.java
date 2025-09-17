import java.util.Scanner;
public class ex14 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
         int n1 = s.nextInt();
        System.out.println("Informe o segundo valor:");
         int n2 = s.nextInt();
        System.out.println("Informe o terceiro valor:");
         int n3 = s.nextInt();

         System.out.println("Qual a forma de ordenação? CRESCENTE OU DECRESCENTE");
         String opcao = s.next();

         if (opcao.equalsIgnoreCase("Crescente")){
            if(n1 <= n2 && n2 <= n3)
                 System.out.println(n1+ "," + n2 + "," + n3);
                 else
                   if(n1 <= n3 && n3 <= n2)
                   System.out.println(n1 + "," + n3 + "," + n2);
                   else
                      if(n2 <= n3 && n3 <= n1)
                      System.out.println(n2 + "," + n3 + "," + n1);
                      else
                        if(n2 <= n1 && n1 <=n3)
                        System.out.println(n2 + "," + n1 + "," + n3);
                        else
                          if(n3 <= n1 && n1 <= n2)
                          System.out.println(n3 + "," + n1 + "," + n2);
                          else
                              if(n3 <= n2 && n2 <= n1)
                              System.out.println(n3 + "," + n2 + "," + n1);
         }
         else
             if (opcao.equalsIgnoreCase("Decrescente")){
                if(n1 >=n2 && n2 >=n3)
                System.out.println(n1 + "," + n2 + ","+ n3);
                else
                    if(n1 >= n3 && n3 >= n2)
                    System.out.println(n1 + "," + n3 + "," + n2);
                    else
                       if(n2 >= n3 && n3 >= n1)
                       System.out.println(n2 + "," + n3 + "," + n1);
                       else
                          if(n2 >= n1 && n1 >= n3)
                          System.out.println(n2 + "," + n1 + "," + n3);
                          else
                             if(n3 >= n1 && n1 >= n2)
                             System.out.println(n3 + "," + n1 + "," + n2);
                             else
                                 if(n3 >= n2 && n2 >= n1)
                                 System.out.println(n3 + "," + n2 + "," + n1);
             }
             else 
                  System.out.println("Opção inválida");

    }
}

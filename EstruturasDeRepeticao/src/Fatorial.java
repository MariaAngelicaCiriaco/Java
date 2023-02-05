import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Fatorial de: ");
        int fat = entrada.nextInt();

        int i;
        int multiplicacao = 1;
        
        
        for( i=fat ; i >=1 ; i-- ){
            multiplicacao = multiplicacao *i ;

        }
        System.out.println( fat + "! = "+multiplicacao);


        entrada.close();
    }
    
}

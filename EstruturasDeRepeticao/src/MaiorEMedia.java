
import java.util.Scanner;

public class MaiorEMedia {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int maior = 0;
        int cont = 0;
        int soma = 0;
        int numero;

        do {
            System.out.println("Numero: ");
            numero = entrada.nextInt();

            soma += numero;
            
            if(numero > maior) maior = numero;

            cont = cont + 1;
        }while(cont < 5);

        System.out.println("O Maior Numero eh: " + maior);
        System.out.println("Media das Somas: " + (soma/5));


        entrada.close();
    }
    
}

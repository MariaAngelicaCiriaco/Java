import java.util.Scanner;


public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota;
        System.out.println("Digite uma nota de 1 a 10: ");
        nota = entrada.nextInt();

        while ( nota < 0 | nota > 10){
            System.out.println(" ah nota está invalida, digite novamente: ");
            nota = entrada.nextInt();

        } 
        System.out.println("nota está correta: " + nota);


        entrada.close();
    }
    
}
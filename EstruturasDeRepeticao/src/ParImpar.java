import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantNum;
        int num;
        int cont = 0;
        int quantPar = 0;
        int quantImpar = 0;

        System.out.println("Digite a Quatidades de Numeros: ");
        quantNum = entrada.nextInt();

        do {
            System.out.println("Digite um Numero: ");
            num = entrada.nextInt();

            if(num % 2 == 0) quantPar++;
            else quantImpar++;

            cont ++;

        } while (cont < quantNum );

        System.out.println("Quantidades de Par: " + quantPar);
        System.out.println("Quantidades de Impar: " + quantImpar);



        entrada.close();
    }
    
}

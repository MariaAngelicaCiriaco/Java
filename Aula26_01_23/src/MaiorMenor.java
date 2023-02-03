import java.util.Scanner;

import javax.swing.InputMap;

public class MaiorMenor{
    public static void main(String[] args) {
        int n1,n2,n3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os valores:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        System.out.println("os valores são: " + n1 + n2 + n3 );

       /* int menor;
        if(n1 < n2){
            menor = n1;
        }
        else if( n2 > n3){
            menor = n3;
        }
        System.out.println("o menor: "+ menor);

        entrada.close();
        */
        entrada.close();
    }

}
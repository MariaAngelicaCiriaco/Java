import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantDeConsoantes = 0;
        int cont = 0;

        do {
            System.out.println("Letra: ");
            String letra = entrada.next();

            if( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")) ){
                    consoantes[cont] = letra;
                    quantDeConsoantes ++;
                }

                cont ++;

        } while (cont < consoantes.length);

        for( String consoante : consoantes){
            if(consoante != null)
            System.out.print(consoante + " - ");
        }

        entrada.close();
    }
    
}

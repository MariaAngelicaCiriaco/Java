

public class OrdemInversa{
    public static void main(String[] args) {
        
        int[] vetor = {2, 9, -9, 3, -2};
        
        System.out.println("Vetor: ");
        int cont = 0;
        while(cont < (vetor.length)){
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.println("Ordem Iversa do Vetor: ");

        for (int i = (vetor.length -1) ; i >= 0 ; i--){
            System.out.print(vetor[i] + " ");
        }
    }

}
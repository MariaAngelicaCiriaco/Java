package ClasseAluno;

public class ClasseAluno {
    private int mat;
    private String nome;
    private float n1,n2;
    private double trabalho;
    
    //construtor
    public ClasseAluno (int mat, String nome, Float n1, Float n2, double trabalho){
        this.mat = mat;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.trabalho = trabalho;
    }

     // métodos
     public double media(){
        return ((n1+n2)*2.5 + trabalho*2)/7;
     }
    
    public double provaFinal(){
        double media = media();
            if(media < 2.5 || media >= 5)
            return 0;

            return 10 -media; 
     }
 
}

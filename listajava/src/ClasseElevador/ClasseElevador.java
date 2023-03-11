package ClasseElevador;

public class ClasseElevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantPessoas;

    //construtor

    public ClasseElevador(int totalAndares, int capacidade){
        this.andarAtual =  0;
        this.quantPessoas = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    // gets e sets

    public int getAndarAtual(){
        return andarAtual;
    }
    public void setAndarAtual(int andar){
        andarAtual = andar;
    }

    public int getTotalAndares(){
        return totalAndares;
    }
    public void setTotalAndares(int totalAnd){
        totalAndares = totalAnd;
    }

    public int getQuantPessoas(){
        return quantPessoas;
    }
    public void setQuantPessoas(int quantPessoas){
        this.quantPessoas = quantPessoas;
    }

    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade= capacidade;
    }


    // metodos

    public void entrar(){
        if(quantPessoas < capacidade)
        this.quantPessoas +=1;
        else
        System.out.println("Elevador lotado!");
    }

    public void sair(){
        if (quantPessoas == 0)
        System.out.println("Elevador vazio!");
        else
        this.quantPessoas --;
    }

    public boolean subir(){
        if(andarAtual < totalAndares){
            andarAtual ++;
            return true;
        }
        return  false;
    }

    public void descer(){
        if(andarAtual !=0){
            andarAtual --;
            return;
        }
        System.out.println("Elevador no térrio!");
    }

    
}

package Governo;

//import java.security.PublicKey;

public class Politico  extends Pessoa{
    
    public Politico (String nome){
        super(nome);
    }
    
    public String partidoPolitico(){
        return getNome();

    }

    public String tostString(){
        return super.toString()+ " sou o politico do partido:" +partidoPolitico();
    }
}

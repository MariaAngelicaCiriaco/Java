package Cliente;

import javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    Cliente (int id, String nome, int idade, String telefone){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public int getId(){
        return id;
    }
    public void setId( int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade( int idade){
        this.idade = idade;
    }

    public String getTefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }


    
    
}

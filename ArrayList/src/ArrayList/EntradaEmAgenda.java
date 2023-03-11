package ArrayList;

public class EntradaEmAgenda {
    private double hora;
    private int dia;
    private String mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(double hora, int dia, String mes, int ano, String assunto){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }
    

    public double getHora(){
        return hora;
    }
    public void setHora(double hora){
        this.hora = hora;
    }

    public double getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public String getMes(){
        return mes;
    }
    public void setMes(String mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getAssunto(){
        return assunto;
    }
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, String mes, int ano){
        return this.dia == dia && this.mes == mes && this.ano == ano ;
    }

    public String toString(){
        return hora + " e " + assunto;
    }

}

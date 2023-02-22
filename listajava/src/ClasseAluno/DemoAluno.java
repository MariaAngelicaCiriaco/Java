package ClasseAluno;

public class DemoAluno {
    public static void main(String[] args) {
        ClasseAluno a = new ClasseAluno(123, "ana", 8F, 1F, 5);
        System.out.println("a media é: " +a.media()+ "e é preciso: " +a.provaFinal()+ "para ser aprovado");
    }
}

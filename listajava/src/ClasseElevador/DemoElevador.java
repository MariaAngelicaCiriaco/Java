package ClasseElevador;

public class DemoElevador {

    public static void main(String[] args) {
		
		ClasseElevador e1 =new ClasseElevador(3, 2);
		System.out.println(e1.getAndarAtual());
		//e1.andarAtual=10;
		e1.entrar();
		e1.entrar();
		e1.entrar();
		e1.entrar();
		System.out.println(e1.getAndarAtual());
		e1.subir();
		e1.subir();
		e1.subir();
		if(e1.subir()) {
			System.out.println("Deu certo!");
		}
		else {
			System.out.println("Já no último andar.");
		}
		
	}
}

 
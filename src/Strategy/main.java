package Strategy;

public class main {

	public static void main(String[] args) {
		
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAtaque();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robot robo = new Robot();
		robo.setStrategy(normal);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		
		

	}

}

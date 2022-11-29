package Strategy;

public class Robot {
	
	private Comportamento comportamento;

	
	public Comportamento getStrategy() {
		return comportamento;
	}

	public void setStrategy(Comportamento strategy) {
		this.comportamento = strategy;
	}
	
	public void mover() {
		comportamento.mover();
	}
	
}

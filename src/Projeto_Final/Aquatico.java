package Projeto_Final;

public class Aquatico implements Animal{

	@Override
	public String movimentar() {
		return "Nadando";
	}

	@Override
	public String habitat() {
		return "Agua";
	}

	@Override
	public String classificacao() {
		return "Marinho";
	}

	@Override
	public void getAnimal() {
		System.out.println("Animais: "+this.classificacao()+" vivem em "+this.habitat()+" onde se movimentam "+this.movimentar());
		
	}

}

package Projeto_Final;

public class Terrestre implements Animal{

	@Override
	public String movimentar() {
		return "Andando";
	}

	@Override
	public String habitat() {
		return "Floresta";
	}

	@Override
	public String classificacao() {
		return "Terrestres";
	}

	@Override
	public void getAnimal() {
		System.out.println("Animais: "+this.classificacao()+" vivem em "+this.habitat()+" onde se movimentam "+this.movimentar());
		
	}

	
}

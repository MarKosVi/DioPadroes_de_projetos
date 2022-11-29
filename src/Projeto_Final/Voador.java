package Projeto_Final;

public class Voador implements Animal{

	@Override
	public String movimentar() {
		return "Voando";
	}

	@Override
	public String habitat() {
		return "Alto das Arvores";
	}

	@Override
	public String classificacao() {
		return "Passaros";
	}

	@Override
	public void getAnimal() {
		System.out.println("Animais: "+this.classificacao()+" vivem em "+this.habitat()+" onde se movimentam "+this.movimentar());
		
	}


}

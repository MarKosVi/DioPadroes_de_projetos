package Projeto_Final;

public class main {

	public static void main(String[] args) {

		Animal terrestre = new Terrestre();
		Animal voador = new Voador();
		Animal aquativo = new Aquatico();
		
		
		Animais cavalo = new Animais();
		cavalo.setTipo(terrestre);
		cavalo.getAnimais();
		Animais passarinho = new Animais();
		passarinho.setTipo(voador);
		passarinho.getAnimais();
	}

}

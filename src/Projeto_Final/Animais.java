package Projeto_Final;

import Projeto_Final.Animal;

public class Animais {
private Animal animal;


	public void setTipo(Animal strategy) {
		this.animal = strategy;
	}
	
	public void getAnimais() {
		animal.getAnimal();
	}
}

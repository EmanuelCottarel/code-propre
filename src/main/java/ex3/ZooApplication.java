package ex3;

import ex3.entites.Animal;
import ex3.entites.Aquarium;
import ex3.entites.Poisson;
import ex3.entites.Zoo;
import ex3.enums.RegimeAlimentaire;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		Aquarium aquarium = new Aquarium("Aquarium 1");
		aquarium.addAnimaux(new Poisson("Nemo", RegimeAlimentaire.CARNIVORE));
		Aquarium aquarium2 = new Aquarium("Aquarium 2");
		zoo.addZone(aquarium);

	}

}
package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Salon;
import nintendo.model.Portable;
import nintendo.model.Hybride;
import nintendo.model.Console;


public class Test {

	public static void main(String[] args) {
		Console sony1 = new Salon("PlayStation 5");
		Console nintendo1 = new Salon("Wii");
		Console microsoft1 = new Salon("XBox One");
		Console nintendo2 = new Hybride("Switch");
		Console sony2 = new Portable("PSP");
		
		Adresse adresse = new Adresse(139, "rue Vauqelin", "Paris");
		Boutique chezEric = new Boutique("Chez Eric", adresse);
		
		Client samus = new Client("Sans Armure", "Samus");
		Client link = new Client("Cartoon", "Link");
	}

}

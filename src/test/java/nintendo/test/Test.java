package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;

public class Test {

	public static void main(String[] args) {
		Console sony1 = new Console("PlayStation 5");
		Console nintendo1 = new Console("Wii");
		Console microsoft1 = new Console("XBox One");
		Console nintendo2 = new Console("Switch");
		Console sony2 = new Console("PSP");
		
		Adresse adresse = new Adresse(139, "rue Vauqelin", "Paris");
		Boutique chezEric = new Boutique("Chez Eric", adresse);
		
		Client samus = new Client("Sans Armure", "Samus");
		Client link = new Client("Cartoon", "Link");
	}

}

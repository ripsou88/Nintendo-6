package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		ArrayList achatsLink = new ArrayList();
		ArrayList achatsSamus = new ArrayList();
		
		Console sony1 = new Salon("PlayStation 5", 110, LocalDate.of(2020, 11, 19));
		Console nintendo1 = new Salon("Wii", 50, LocalDate.of(2006, 12, 8));
		Console microsoft1 = new Salon("XBox One", 60, LocalDate.of(2013, 11, 22));
		Console nintendo2 = new Hybride("Switch", 200, LocalDate.of(2017, 3, 3));
		Console sony2 = new Portable("PSP", 30, LocalDate.of(2005, 9, 1));
		
		Adresse adresse = new Adresse(139, "rue Vauqelin", "Paris");
		Boutique chezEric = new Boutique("Chez Eric", adresse);
		
		Jeu jeu1 = new Jeu("Zelda Breath of the Wild", nintendo2, chezEric);
		Jeu jeu2 = new Jeu("Gran Turismo", sony1, chezEric);
		Jeu jeu3 = new Jeu("Metroid Prime", nintendo1, chezEric);
		
		Collections.addAll(achatsLink, jeu1, jeu2);
		Collections.addAll(achatsSamus, jeu2, jeu3);

		Client samus = new Client("Sans Armure", "Samus");
		Client link = new Client("Cartoon", "Link");
		
		link.setListeAchats(achatsLink);
		samus.setListeAchats(achatsSamus);
	}

}

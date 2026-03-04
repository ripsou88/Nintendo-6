package nintendo.model;

import java.time.LocalDate;

abstract class Console {

	protected String nom;
	protected double prix;
	protected LocalDate dateSortie;

	public Console(String nom, double prix, LocalDate dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}

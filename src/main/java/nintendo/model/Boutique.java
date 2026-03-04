package nintendo.model;

public class Boutique {
protected String nom;
protected Adresse adresse;
public Boutique(String nom, Adresse adresse) {
	super();
	this.nom = nom;
	this.adresse = adresse;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Adresse getAdresse() {
	return adresse;
}
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}
@Override
public String toString() {
	return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
}

}

package metier;

import java.util.ArrayList;
import java.util.List;

public class Boutique {
	
	protected Adresse adresse;
	protected String nom;
	protected List<Jeu> jeux = new ArrayList();
	
	public Boutique(String nom, Adresse adresse, List<Jeu> jeux) {

		this.nom = nom;
		this.adresse = adresse;
		this.jeux = jeux;
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

	public List<Jeu> getJeux() {
		return jeux;
	}

	public void setJeux(List<Jeu> jeux) {
		this.jeux = jeux;
	}

}

package metier;

import java.time.LocalDate;

public class Achat {
	private String date;
	private double prix;
	private Jeu jeu;
	private Boutique boutique;
	
	public Achat(Jeu jeu, String date, double prix, Boutique boutique) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
		this.boutique=boutique;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}

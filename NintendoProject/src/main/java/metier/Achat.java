package metier;

import java.time.LocalDate;

public class Achat {
	private LocalDate date;
	private double prix;
	private Jeu jeu;
	private Boutique boutique;
	
	public Achat(Jeu jeu, LocalDate date, double prix, Boutique boutique) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
		this.boutique=boutique;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}

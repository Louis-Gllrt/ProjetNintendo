package metier;

public class Console {

	private String nom;
	private double prix;
	private String dateSortie;

	

	protected Console(String nom, double prix, String dateSortie) {
		super();
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

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}
	
	
}

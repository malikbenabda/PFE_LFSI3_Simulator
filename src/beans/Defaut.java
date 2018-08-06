package beans;

public class Defaut {

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Remede[] getListe() {
		return liste;
	}

	public void setListe(Remede[] liste) {
		this.liste = liste;
	}

	private String nom, code;
	private Remede liste[];

}

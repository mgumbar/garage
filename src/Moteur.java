import java.io.Serializable;

public abstract class Moteur implements Serializable {

	private TypeMoteur type;
	private String cylindre;
	private Double prix;
	
	Moteur(String cylindre, Double prix)
	{
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	/**
	 * @return the cylindre
	 */
	public String getCylindre() {
		return cylindre;
	}
	/**
	 * @param cylindre the cylindre to set
	 */
	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	/**
	 * @return the type
	 */
	public TypeMoteur getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeMoteur type) {
		this.type = type;
	}
	
	public String toString() {
		return this.cylindre + " " + this.getType() + " " + this.getPrix();
	}
	
}

package esprit.tn.soa.entity;

public class Logement {
	private int reference;
	private String adresse;
	private String delegation;
	private String gouvernorat;
	private Type type;
	private String description;
	private float prix;
	
	public enum Type {Studio, Appartement, Villa, EtageVilla} ;

	
	
	public Logement() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Logement(int reference, String adresse, String delegation, String gouvernorat, Type type, String description, float prix) {
		super();
		this.reference = reference;
		this.adresse = adresse;
		this.delegation = delegation;
		this.gouvernorat = gouvernorat;
		this.type=type;
		this.description = description;
		this.prix = prix;
	}

	public Logement(int reference, String adresse) {
		super();
		this.reference = reference;
		this.adresse = adresse;
	}
	
	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}



	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getDelegation() {
		return delegation;
	}

	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}



	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	
	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + reference;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logement other = (Logement) obj;
		if (reference != other.reference)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Logement [reference=" + reference + ", adresse=" + adresse + ", delegation=" + delegation
				+ ", gouvernorat=" + gouvernorat + ", type=" + type + ", description=" + description + ", prix=" + prix
				+ "]";
	}
	
	
	

}

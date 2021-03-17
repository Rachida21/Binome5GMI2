package Tp_Expressions;

class Variable extends ExpAbstraite {
	String nom;
	

	public Variable(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
public String toStringInfixe() {
		
		return this.nom;
	}	
}

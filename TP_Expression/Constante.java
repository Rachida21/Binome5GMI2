package Tp_Expressions;

public class Constante extends ExpAbstraite {
	double valeur;
	
	

	public Constante(double valeur) {
		super();
		this.valeur = valeur;
	}

	public double getValeur() {
		return valeur;
	}
	
	public String toStringInfixe() {
		
		return " "+ this.valeur;
	}	
}

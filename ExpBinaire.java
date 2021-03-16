package Tp_Expressions;

public abstract class ExpBinaire extends ExpAbstraite{
	ExpAbstraite opGauche; 
	ExpAbstraite opDroite;
	
	public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroite) {
		super();
		this.opGauche = opGauche;
		this.opDroite = opDroite;
	}

	public ExpAbstraite getOpGauche() {
		return opGauche;
	}

	public ExpAbstraite getOpDroite() {
		return opDroite;
	}

	
	
}






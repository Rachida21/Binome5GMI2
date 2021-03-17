package Tp_Expressions;

class BinaireMult extends ExpBinaire {

	public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroite) {
		super(opGauche, opDroite);
		// TODO Auto-generated constructor stub
	}
	
	public String toStringInfixe() {
		String a;
		a = null;
		a += "(" ;
		a += opGauche.toStringInfixe();	
		a += "*";
		a += opDroite.toStringInfixe();
		
		return a;
	}
	
}	

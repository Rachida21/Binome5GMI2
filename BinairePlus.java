package Tp_Expressions;

public class BinairePlus extends ExpBinaire {
	

	public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroite) {
		super(opGauche, opDroite);
		// TODO Auto-generated constructor stub
		
	}
	
		public String toStringInfixe() {
			String a;
			a = null;
			a += "(" ;
			a += opGauche.toStringInfixe();	
			a += "+";
			a += opDroite.toStringInfixe();
			
			return a;
		}
	
	
	
	}
	
	
	


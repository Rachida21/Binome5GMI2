package TP4;

//Q1

public class Animal{
	private String nom;
	private int poids;
	private Regime regime;     // Q8
	
	
	public Animal(String nom, int poids,Regime regime) {    // constructeur
		this.nom = nom;
		this.poids = poids;
		this.regime = regime;
	}
	
	public String getNom() {     //getteurs
		return nom;
	}
	
	public int getPoids() {
		return poids;
	}
	
	
	public void crier() {    //methode crier 
		System.out.println("<nom> crie...");
		
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", poids=" + poids + "]";
	}  
	
	
	
}

	

//Q4

class Canard extends Animal {
	private String couleurPlumes;
	
	public Canard(String nom, int poids, String couleurPlumes) {
        super();
        this.couleurPlumes = couleurPlumes;
	}
	
	public String getCouleurPlumes() {
		return couleurPlumes;
		
	}
	

    @Override
    public void crier() {
        super.crier();
        System.out.println("Sylvain crie...Ce canard de " + poids + " kilos aux belles plumes "
            + couleurPlumes + " cancane!");
    }
	
	
}




class Vache extends Animal {
	private int nbTaches;
	public Vache(String nom, int poids, int nbTaches) {
        super();
        this.nbTaches = nbTaches;
	}
	
	public int getNbTaches() {
		return nbTaches;
		
	}

	@Override
	public String toString() {
		return "Matthieu, la vache " + nbTaches + "taches qui tachent, crie... il meugle ";
	}
	
	
	
	
				
}
package TP4;

import java.util.LinkedList;

class Zoo {
    private String nom;
    private LinkedList<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new LinkedList<Animal>();
    }

    public int getNbAnimaux() {
        return animaux.size();
    }

    public void ajouteAnimal(Animal animal) {
        animaux.add(animal);
    }

    
    public void crier() {      // Q2 : La methode crier a pour but de faire crier tous les animaux
    	for (Animal a : animaux) {
            a.crier();
        }
    }

  
  
    @Override
    public String toString() { // permet de retourner le nom du Zoo et le nombre d'aniaml qu'il contient 

	return("Le zoo " + nom + " contient: " +  animaux);


    }

}




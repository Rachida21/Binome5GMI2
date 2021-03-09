package TP4;

//Q3

public class Test {

    public static void main(String[] args) {
        Zoo eisti= new Zoo("EISTI");
        Animal Catherine = new Animal("Catherine",10);   
        Animal Julie = new Animal("Julie",20);
        Animal Sahar = new Animal("Sahar",30);
        Animal Benoit = new Animal("Benoit",40);
        Animal Nicolas = new Animal("Nicolas",50);
        Animal Sebastien = new Animal("Sebastien",60);
        Animal Sylvain = new Animal("Sylvain",70);
        
        eisti.ajouteAnimal(Catherine);
        eisti.ajouteAnimal(Julie);
        eisti.ajouteAnimal(Sahar);
        eisti.ajouteAnimal(Benoit);
        eisti.ajouteAnimal(Nicolas);
        eisti.ajouteAnimal(Sebastien);
        eisti.ajouteAnimal(Sylvain);
        
        System.out.println(eisti);
        eisti.crier();
        
    
    }

 

}
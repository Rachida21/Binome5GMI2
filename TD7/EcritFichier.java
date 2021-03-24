package testFichiers;

import java.io.*;

public class EcritFichier {
	
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("essai.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Ceci est un fichier ");
			bw.newLine();
			
			bw.write("je vais y écrire une fiche ");
			bw.newLine();
			
			bw.write("Les fichiers: Entrees/Sorties");
			bw.close();
			
		}
		catch (Exception e) 
		{ System.out.println("Erreur" +e);}
		}
			
}	
	
	
	
	



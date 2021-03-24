package testFichiers;

import java.io.*; 

public class CopieFichier {
	public static void main(String[] args) {
        
        try {
        	FileReader fr=new FileReader("essai.txt");
			BufferedReader br= new BufferedReader(fr);
			FileWriter fw = new FileWriter("essai.txt");
			BufferedWriter bw = new BufferedWriter(fw);
        
        String carac;
        
        while((carac = br.readLine()) != null){
        	bw.write(carac); 
            bw.newLine(); 
        }
        
         bw.close();
         
        }
        catch (Exception e)
        { System.out.println("Erreur "+e);}
        
    }
	

}

package testFichiers;
import java.io.*;

public class testPerformance {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			int a=1000000;
			
			for (int i=0; i<a; i+=2) {   // int i+=2 pour avoir que les nb pairs 
				bw.write(Integer.toString(i));  // convertir l'integer i en chaine de caractere
				bw.newLine();
				
			}
			
			
			bw.close();
			
		}
		catch (Exception e) 
		{ System.out.println("Erreur" +e);}
		
		
		
		
		
		FileInputStream fis; BufferedInputStream bis;
		try {
			fis = new FileInputStream(new File("test.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
			byte[] buf = new byte[8];
			long startTime = System.currentTimeMillis();
			while(fis.read(buf) != -1);
			System.out.println("Temps de lecture avec FileInputStream : " +(System.currentTimeMillis() - startTime));
			startTime = System.currentTimeMillis();
			while(bis.read(buf) != -1);
			System.out.println("Temps de lecture avec BufferedInputStream : " +(System.currentTimeMillis() - startTime));
			fis.close();
			bis.close();
			}
		catch (FileNotFoundException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
}
}


//Resultat

// Temps de lecture avec FileInputStream : 182
//Temps de lecture avec BufferedInputStream : 14
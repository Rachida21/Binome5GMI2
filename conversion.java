package myfirstproject1;


// Exo 5

public class conversion {
	
	/*Méthode qui converti le tableau de paramètre en tableau d'entier */
	public static int[] Conversion(String[] tab1, int taille) {
		int[] tab = new int[taille];
		for (int i=0; i<taille; i++) {
			tab[i]=java.lang.Integer.parseInt(tab1[i]);
		}
		return tab;
	}
	
	/*Méthode qui calcule la somme des entier en paramètre*/ 
	public static int Sum(int[] tab, int taille) {
		int sum=0;
		for (int i=0; i<taille; i++) {
			sum=sum+tab[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int taille=args.length;
		int[] tab = new int[taille];
		tab=Conversion(args,taille);
		System.out.println("Première méthode pour afficher le tableau : ");
		for (int value : tab) {
			System.out.println(value);
		}
		System.out.println("Deuxième méthode pour afficher le tableau : ");
		System.out.println(java.util.Arrays.toString(tab));
		int sum=Sum(tab,taille);
		System.out.println("Somme : ");
		System.out.println(sum);
	}

}
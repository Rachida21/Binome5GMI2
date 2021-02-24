package myfirstproject1;



// exo II

import java.util.Scanner;

public class Calc {
	
	public static void main(String[]args)

	{
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Saisir un entier :");
		int value=sc.nextInt();// variable value de type entier
		System.out.print("Saisir un entier :");
		int value2=sc.nextInt();
		System.out.println(+value);
		System.out.println("la somme est" + (value+value2));
		sc.close();

	 
	}

}

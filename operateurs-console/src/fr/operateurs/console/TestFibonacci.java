package fr.operateurs.console;

import java.util.Scanner;

public class TestFibonacci {

	/**
	 * @param N Rang de la suite
	 * @return le nombre de rang N dans une suite de Fibonacci de  manière récursive
	 */
	static int calculeFibonacciRécursif(int N) {
		if (N == 1) {			//sortie si N vaut 1
			return 0;
			
		} else if (N == 2) {	//sortie si N vaut 2
			return 1;
			
		} else 					/*sinon appliquer la formule mathematique de Fibonacci 
								"Un=Un-1+Un-2" de manière récursive */
			return calculeFibonacciRécursif(N - 1) + calculeFibonacciRécursif(N - 2);
	}

	/**
	 * @param N Rang de la suite
	 * @return le nombre de rang N dans une suite de Fibonacci
	 */
	static int calculeFibonacci(int N) {
		if (N == 1) {							//Sortie si N vaut 1
			return 0;
		} else if (N == 2) {					//Sortie si N vaut 2
			return 1;
		} else {					
			int u0 = 0;		
			int u1 = 1;
			int val = u0 + u1;					//Calcule de N=3
			for (int i = 4; i <= N; i++) {		//On applique N-3 fois Fibonacci après le calcule de N=3
				u0 = u1;						//Pour chaque itération de N on va redéfinir u0 u1 
				u1 = val;						//ce qui nous donnera le nouveau résultat
				val = u0 + u1;
			}
			return val;	
		}

	}


	public static void main(String[] args) {
		System.out.println("Veuillez saisir le rang N de la suite de Fibonacci");
		Scanner questionUser = new Scanner(System.in);			//initialisation de Scanner
		int a = questionUser.nextInt();							//Saisis d'un entier N représentant le rang de la suite
		int result = calculeFibonacci(a);						//Appel de la méthode de traitement
		System.out.println("résultat : "+result);				//Affichage

	}

}

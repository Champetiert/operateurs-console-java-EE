package fr.operateurs.console;

public class TestArray2 {
	static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

	/**
	 * Calcule de la moyenne des valeurs du tableau
	 */
	static void moy(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i]; // calcule de la sommes du tableaux
		}
		// Affichage du résultat et calcule de la moyenne avec la formule "sommes des
		// éléments/ nombre d'élément"
		System.out.println("la moyenne du tableau est " + (sum / array.length));
	}

	/**
	 * Compte du nombre de doublon dans un tableau
	 */
	static void doublon() {
		int doublon[] = new int[array.length / 2];	//il ne peut pas y avoir plus de la moitié des éléments comme doublon
		int cpt = 0;								// cpt correspond aux nombres de doublon trouvé

		for (int i = 0; i < array.length - 1; i++) {	//Pour chaque valeur du tableau on va vérifier s'il existe un doublon
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {				//commpare les valeur du tableau
					if (cpt > 0) {						//vérifie si le tableau contient au moins un doublon
						for (int k = 0; k < cpt; k++) {
							if (array[i] == doublon[k]) {	//vérifie si le doublon existe déjà dans le tableau de doublon
								break;						//dans ce cas on n'incremente pas le compteur de doublon
							}
							if (cpt - 1 == k) {			
								doublon[cpt] = array[i];	//ajouter le nouveau doublon au tableau
								cpt++;						//incrementer le compteur de doublon
							}
						}
					} else {
						doublon[cpt] = array[i];			//ajouter le nouveau doublon au tableau
						cpt++;								//incrementer le compteur de doublon
					}
				}
			}
		}
		System.out.println("il y a "+cpt+" valeur(s) qui a/ont au moins un doublon dans le tableau"); //affichage du résultat
	}

	public static void main(String[] args) {
		// moy(array);
		// l'entié 15 a pour index 1
		doublon();
	}

}

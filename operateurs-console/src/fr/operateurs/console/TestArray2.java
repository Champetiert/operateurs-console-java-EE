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
		int doublon[] = new int[array.length / 2];
		int cpt = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					if (cpt > 0) {
						for (int k = 0; k < cpt; k++) {
							if (array[i] == doublon[k]) {
								break;
							}
							if (cpt - 1 == k) {
								doublon[cpt] = array[i];
								cpt++;
							}
						}
					} else {
						doublon[cpt] = array[i];
						cpt++;
					}
				}
			}
		}
		System.out.println(cpt);
	}

	public static void main(String[] args) {
		// moy(array);
		// l'entié 15 a pour index 1
		// doublon();
	}

}

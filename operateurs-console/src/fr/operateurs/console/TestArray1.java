package fr.operateurs.console;

public class TestArray1 {

	static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

	/**
	 * Affiche le tableau du plus peutit index au plus grand
	 */
	static void increment() {
		for (int i = 0; i < array.length; i++) { //boucle de lecture du tableau de longueur array.length
			System.out.println(array[i]);
		}
	}

	/**
	 * Affiche le tableau du plus grand index au plus petit
	 */
	static void decrement() {
		for (int i = array.length - 1; i >= 0; i--) {//boucle de lecture inverse du tableau de longueur array.length
			System.out.println(array[i]);
		}
	}

	/**
	 * Affiche les valeurs du tableau qui sont > à 3
	 */
	static void supTroi() {
		for (int i = 0; i < array.length; i++) {//boucle de lecture du tableau de longueur array.length
			if (array[i] > 3) {					//condition affichage valeur array a indice i > à 3
				System.out.println(array[i]);
			}
		}
	}

	/**
	 * Affiche les valeurs du tableau qui sont paires
	 */
	static void pairs() {
		for (int i = 0; i < array.length; i++) {//boucle de lecture du tableau de longueur array.length
			if (array[i] % 2 == 0) {			//condition affichage valeur array a indice i quand son modulo = 0
				System.out.println(array[i]);
			}
		}
	}

	/**
	 * Affiche la valeur Max du tableau
	 */
	static void max() {
		int max = array[0];							//initialise le max à la première valeur du tableau
		for (int i = 1; i < array.length; i++) {	//boucle de lecture du tableau de longueur array.length
			if (array[i] > max) {					//test si la valeur array à l'indice i est > a la valeur max
				max = array[i];						//si vrais, alors on change la valeur max
			}
		}
		System.out.println(max);
	}

	/**
	 * Affiche la valeur Min du tableau
	 */
	static void min() {
		int min = array[0];							//initialise le min à la première valeur du tableau
		for (int i = 2; i < array.length; i++) {	//boucle de lecture du tableau de longueur array.length
			if (array[i] < min) {					//test si la valeur array à l'indice i est < a la valeur min
				min = array[i];						//si vrais, alors on change la valeur min
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// increment();
		// decrement();
		// supTroi();
		// pairs();
		// max();
		//min();

	}

}

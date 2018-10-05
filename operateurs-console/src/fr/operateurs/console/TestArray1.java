package fr.operateurs.console;

public class TestArray1 {

	static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

	/**
	 * Affiche le tableau du plus peutit index au plus grand
	 */
	static void increment() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * Affiche le tableau du plus grand index au plus petit
	 */
	static void decrement() {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	/**
	 * Affiche les valeurs du tableau qui sont > à 3
	 */
	static void supTroi() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
	}

	/**
	 * Affiche les valeurs du tableau qui sont paires
	 */
	static void pairs() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}

	/**
	 * Affiche la valeur Max du tableau
	 */
	static void max() {
		int max = array[0];
		for (int i = 2; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

	/**
	 * Affiche la valeur Min du tableau
	 */
	static void min() {
		int min = array[0];
		for (int i = 2; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
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

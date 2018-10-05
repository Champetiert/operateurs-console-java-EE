package fr.operateurs.console;

public class TestArray2 {
	static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

	static void moy() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println((sum / array.length));
	}

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
		// moy();
		// l'entié 15 a pour index 1
		doublon();
	}

}

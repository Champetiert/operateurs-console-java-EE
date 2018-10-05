package fr.operateurs.console;

import java.util.Scanner;

public class Menu {

	static int[] array = new int[10];
	private static Scanner questionUser;

	static void afficher(int[] tab, int index) {
		if (index == 0) {
			System.out.println("tableaux vide");
		} else {
			for (int i = 0; i <= index - 1; i++) {
				System.out.println(array[i]);
			}
		}
	}

	static void ajouter(int[] tab, int index, int numb) {
		tab[index] = numb;
	}

	public static void main(String[] args) {
		int index = 0;
		int a, b;
		questionUser = new Scanner(System.in);
		while (true) {
			System.out.println("1. Ajouter un nombre\r\n" + "2. Afficher les nombres existants.");
			a = questionUser.nextInt();
			switch (a) {
			case 1:
				System.out.println("saisir nombre:");
				b = questionUser.nextInt();
				ajouter(array, index, b);
				index++;
				break;
			case 2:
				afficher(array, index);
				break;
			default:
				System.out.println("saisir une valeur valide");
				break;

			}
			System.out.println("\n");	
		}
	}
}
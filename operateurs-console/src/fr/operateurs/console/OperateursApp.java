package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	public int lala(String[] test) {
		return 3;
	}

	private static Scanner questionUser;

	public static void main(String[] args) {
		questionUser = new Scanner(System.in);

		System.out.println("***** Application Op�rateurs *****\r\n" + "Veuillez saisir le premier nombre...");
		int a = questionUser.nextInt();

		System.out.println("Veuillez saisir le second nombre...");

		int b = questionUser.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "%" + b + "=" + (a % b));
	}

}

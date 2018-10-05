package fr.operateurs.console;

import java.util.Scanner;

public class TestFibonacci {
	
	
	/**
	 * @param N Rang de la suite
	 * @return le nombre de rang N dans une suite de Fibonacci
	 */
	static int calculeFibonacciRécursif(int N) {
		if(N ==1) {
			return 0;
		}else if (N==2) {
			return 1;
		}else return calculeFibonacciRécursif(N-1)+calculeFibonacciRécursif(N-2);
	}
	
	/**
	 * @param N
	 * @return
	 */
	static int calculeFibonacci(int N) {
		if(N ==1) {
			return 0;
		}else if (N==2) {
			return 1;
		}else {
			int u0=0;
			int u1=1;
			int val=u0+u1;
			for(int i=4;i<=N;i++) {
				u0=u1;
				u1=val;
				val=u0+u1;		
			}
			return val;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Veuillez saisir le rang N de la suit de Fibonacci");
		Scanner questionUser = new Scanner(System.in);
		int a = questionUser.nextInt();
		int result=calculeFibonacci(a);
		System.out.println(result);
		

	}

}

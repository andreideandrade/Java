package Atividade01;

import java.security.SecureRandom;

public class Matriz {

	public static void main(String[] args) {
		
		int la = 2;
		int ca = 3;
		
		int lb = 3;
		int cb = 2;
		
		int lc = 2;
		int cc = 3;
		
		int[][] matrizA = new int[la][ca];
		int[][] matrizB = new int[lb][cb];
		int[][] calculo1 = new int[lc][cc];
		int[][] calculo2 = new int[lc][cc];
		int[][] matrizC = new int[2][3];
		
		// 0, 0 | 0, 1 | 0, 2 | 1, 0 | 1, 1 | 1, 2 |
				
		/**
		 * Matriz A popula matriz
		 */
		for(int l = 0; l < la ; l++) {
			for(int c =0; c < ca; c++) {
				matrizA[l][c] = new SecureRandom().nextInt(10);
				//System.out.printf("%2d,%2d |", l,c);
			}
		}
		
		/**
		 * Matriz B popula matriz
		 */
		for(int l = 0; l < lb ; l++) {
			for(int c =0; c < cb; c++) {
				matrizB[l][c] = new SecureRandom().nextInt(10);
			}
		}
		System.out.println();
		/**
		 * Matriz a e b multiplica matriz
		 */
		
		
		for(int l = 0; l < la ; l++) {
			for(int c =0; c < ca; c++) {
				 calculo1[l][c] += matrizA[l][c] * matrizB[0][l];
				 
				 calculo2[l][c] += matrizA[l][c] * matrizB[c][1];
			}
		}
		
		for(int l = 0; l < la ; l++) {
			for(int c =0; c < ca; c++) {
				
				 matrizC[l][c] += calculo1[l][c];
				 
				 matrizC[l][c] += calculo2[l][c];
			}
		}
		
		/**
		 * Imprime matriz
		 */
		System.out.println();
		System.out.print(" | ");
		for(int l = 0; l < lc ; l++) {
			
			for(int c =0; c < cc; c++) {
				System.out.printf("%2d " , matrizC[l][c]);
			}
			System.out.print(" | ");
		}
		
		System.out.println();
		System.out.print(" | ");
		for(int l = 0; l < lc ; l++) {
			for(int c =0; c < cc; c++) {
				System.out.printf("%2d " , calculo2[l][c]);
			}
			System.out.print(" | ");
		}
	}
}
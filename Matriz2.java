package Atividade01;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Matriz2 {
	
	

	public static void main(String[] args) {
				
//		Constantes da matriz		
		final int linhaA = 2;
		final int colunaA = 3;
		
		final int linhaB = 3;
		final int colunaB = 2;
		
		final int linhaC = 2;
		final int colunaC = 2;
		
		final int linhaCa = 2;
		final int colunaCb = 2;
		

		int[][] A = new int[linhaA][colunaA];
		int[][] B = new int[linhaB][colunaB];
		int[][] Ca = new int[linhaB][colunaB];
		int[][] Cb = new int[linhaB][colunaB];
		int[][] C = new int[linhaA][colunaA];
		
		
//		POPULA MATRIZ
		for (int l = 0; l < linhaA; l++) {
			for (int c = 0; c < colunaA; c++) {
				A[l][c] = new SecureRandom().nextInt(10);
			}
		}
		
		for (int l = 0; l < linhaB; l++) {
			for (int c = 0; c < colunaB; c++) {
				B[l][c] = new SecureRandom().nextInt(10);
			}
		}
		
		System.out.println("Matriz A");
		for (int l = 0; l < linhaA; l++) {
			for (int c = 0; c < colunaA; c++) {
				
				System.out.print(A[l][c] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("Matriz B");
		for (int l = 0; l < linhaB; l++) {
			for (int c = 0; c < colunaB; c++) {
				
				System.out.print(B[l][c] + " ");
			}
			System.out.println();
		}
		
//	===================		A * B = C	======================	
		for (int l = 0; l < linhaA; l++) {
			for (int c = 0; c < colunaA; c++) {
				C[l][c] = B[c][l] * A[l][c];
				// colocar o metodo multiplicar
			}
		}
		
				
//		IMPRIME MATRIZ C
		System.out.println("Matriz C");
		for (int l = 0; l < linhaA; l++) {
			for (int c = 0; c < colunaA; c++) {
		
				System.out.print(C[l][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("teste de metodo");
		
		System.out.println(multiplicar(9 , 8));
		System.out.println(somar(9,8));
		
		
	}
	
	private static int somar(int a , int b) {
		
		return a + b;
	}

	private static int multiplicar(int a, int b) {
		
		return a * b;
	}

}


//int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas da A"));
//int M = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de colunas da A"));
//int O = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas da B"));
//int P = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de colunas da B"));

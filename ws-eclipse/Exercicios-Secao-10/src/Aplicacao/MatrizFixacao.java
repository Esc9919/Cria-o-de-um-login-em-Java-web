package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class MatrizFixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int c = sc.nextInt();
		int l = sc.nextInt();
		int[][] mat = new int[c][l];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == n) {
					System.out.println("Posicao: " + i + "," + j + ":");
					if(j>0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if(i>0) {
						System.out.println("Cima: " + mat[i-1][j]);
					}
					if(j<mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i<mat.length-1) {
						System.out.println("Baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		sc.close();
	}

}

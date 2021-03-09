package view;

import controller.somaVetor;

public class Program {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];

		//Adiciona numero Aleatorios na matriz
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 5; y++) {
				int num = (int) (Math.random() * 10) + 1;
				matriz[x][y] = num;
			}
		}
		
		System.out.println("Valores da Matriz");
		for(int[] x: matriz) {
			for(int y: x) {
				System.out.print(" "+ y + " ");
			}
			System.out.println();
		}
		//Pega Linha do vetor
		int[] linha0 = pegaLinha(0, matriz);
		int[] linha1 = pegaLinha(1, matriz);
		int[] linha2 = pegaLinha(2, matriz);
		System.out.println(" ========***======== ");
		
		//Threads 
		Thread t1 = new somaVetor(linha0, "linha0");
		Thread t2 = new somaVetor(linha1, "linha1");
		Thread t3 = new somaVetor(linha2, "linha2");
		t3.start();
		t1.start();
		t2.start();
	}
	
	public static int[] pegaLinha(int linha, int[][] matriz) {
		int[] vetor = new int[5];
		for(int x = 0; x < 5; x++) {
			vetor[x] = matriz[linha][x];
		}
		return vetor;
	}

}

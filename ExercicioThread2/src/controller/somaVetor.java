package controller;

public class somaVetor extends Thread {
	private int[] vetor;
	private String linha;

	public somaVetor(int[] vetor, String linha) {
		this.vetor = vetor;
		this.linha = linha;
	}

	@Override
	public void run() {
		soma();
	}

	private void soma() {
		int soma = 0;
		for (int x : vetor) {
			soma += x;
		}
		System.out.println("Soma dos valores " +  linha + ": " + soma);
	}

}

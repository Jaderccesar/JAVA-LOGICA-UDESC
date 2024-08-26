package lista3;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int totalValores = 20;
		int countPositivos = 0;
		int countNegativos = 0;

		System.out.println("Digite 20 valores inteiros:");

		for (int i = 0; i < totalValores; i++) {
			int valor = s.nextInt();
			if (valor > 0) {
				countPositivos++;
			} else if (valor < 0) {
				countNegativos++;
			}
		}

		double percentualPositivos = (double) countPositivos / totalValores * 100;
		double percentualNegativos = (double) countNegativos / totalValores * 100;

		System.out.println("Percentual de valores positivos: " + percentualPositivos + "%");
		System.out.println("Percentual de valores negativos: " + percentualNegativos + "%");

		s.close();

	}

}

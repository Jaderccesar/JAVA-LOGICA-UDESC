package lista1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double quantKG = 0;

		System.out.println("Informe quantos peixes você pescou: ");
		int quantPeixes = s.nextInt();

		for (int i = 0; i < quantPeixes; i++) {
			System.out.println("Informe quantos Quilos esse peixe possui: ");
			quantKG += s.nextDouble();
		}

		if (quantKG > 500) {
			double quantPassada = quantKG - 500;
			double multa = quantPassada * 4;
			System.out.println("Você terá que pagar uma multa por execeder o peso. Peso execedido: " + quantPassada
					+ " a multa é de: " + multa + " R$.");
		} else {
			System.out.println("Você não possuiu nenhuma multa");
		}

		s.close();

	}

}

package lista1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = s.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = s.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota3 = s.nextDouble();
		System.out.println("Informe a quarta nota: ");
		double nota4 = s.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.println("Aprovado com média: " + media);
		} else {
			System.out.println("Informe a sua nota de exame: ");
			double notaExame = s.nextDouble();

			double novaMedia = (media + notaExame) / 2;

			if (novaMedia >= 5) {
				System.out.println("Aprovado com exame \n Sua média foi: " + media
						+ " \n ao realizar seu exame sua nova média foi: " + novaMedia);
			} else {
				System.out.println("Infelizmente você não foi aprovado.");
			}

		}

	}

}

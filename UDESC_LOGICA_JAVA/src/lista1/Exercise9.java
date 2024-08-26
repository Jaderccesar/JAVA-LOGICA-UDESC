package lista1;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe o primeiro número");
		double numero1 = s.nextDouble();
		System.out.println("Informe o segundo número");
		double numero2 = s.nextDouble();
		System.out.println("Informe o terceiro número");
		double numero3 = s.nextDouble();
		System.out.println("Informe o quarto número");
		double numero4 = s.nextDouble();
		System.out.println("Informe o quinto número");
		double numero5 = s.nextDouble();

		double media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;

		System.out.println("Os números maiores que a média são: ");

		if (numero1 > media) {
			System.out.println("O primeiro número: " + numero1);
		}

		if (numero2 > media) {
			System.out.println("O segundo número: " + numero2);
		}

		if (numero3 > media) {
			System.out.println("O terceiro número: " + numero3);
		}

		if (numero4 > media) {
			System.out.println("O quarto número: " + numero4);
		}

		if (numero5 > media) {
			System.out.println("O quinto Número: " + numero5);
		}

		System.out.println("E a média é: " + media);

		s.close();

	}

}

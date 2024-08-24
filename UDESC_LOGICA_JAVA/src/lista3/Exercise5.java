package lista3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int contPrimos = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o número: ");
			int numero = s.nextInt();
			boolean primo = true;

			if (numero <= 1) {
				primo = false;
			} else {
				for (int j = 2; j < numero; j++) {
					if (numero % j == 0) {
						primo = false;
					}
				}
			}

			if (primo) {
				contPrimos++;
			}

		}

		System.out.println("A quantidade de números primos é: " + contPrimos);

		s.close();

	}

}

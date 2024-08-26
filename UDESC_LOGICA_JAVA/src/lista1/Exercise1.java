package lista1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int cont = 0;

		System.out.println("Informe um número: ");
		int numero = s.nextInt();

		if (numero % 10 == 0) {
			cont += 1;
		}

		if (numero % 5 == 0) {
			cont += 4;
		}

		if (numero % 2 == 0) {
			cont += 6;
		}

		if (cont == 1) {
			System.out.println("O número " + numero + " é divisivel por 10 somente!");
		} else if (cont == 5) {
			System.out.println("O número " + numero + " é divisivel por 10 e por 5 somente!");
		} else if (cont == 4) {
			System.out.println("O número " + numero + " é divisivel somente por 5!");
		} else if (cont == 10) {
			System.out.println("\"O número " + numero + " é divisivel por 5 e por 2 somente!");
		} else if (cont == 6) {
			System.out.println("O número " + numero + " é divisivel somente por 2!");
		} else if (cont == 7) {
			System.out.println("O número " + numero + " é divisivel por 10 e 2 somente!");
		} else if (cont == 11) {
			System.out.println("O número " + numero + " é divisivel por 10, 5 e 2!");
		} else {
			System.out.println("O número " + numero + " não é divisivel por 10 nem por 5 e nem por 2");
		}

		s.close();

	}

}

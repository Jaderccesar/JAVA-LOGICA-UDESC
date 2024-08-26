package lista3;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int valor = s.nextInt();
		int numero = valor;

		int calc = 0;

		for (int i = (valor - 1); i > 0; i--) {
			calc = valor * i;
			valor = calc;
		}

		System.out.println("O fatorial de " + numero + " é: " + calc);

		s.close();

	}

}

package lista3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int numero = 0;
		int maior = 0;
		int menor = 999999999;
		int soma = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Informe o número: ");
			numero = s.nextInt();
			soma += numero;

			if (numero > maior) {
				maior = numero;
			}

			if (menor > numero) {
				menor = numero;
			}

		}

		double media = soma / 10;

		System.out.println("O maior número informado é: " + maior);
		System.out.println("O menor número informado é: " + menor);
		System.out.println("A média dos número lidos é: " + media);

		s.close();
	}

}

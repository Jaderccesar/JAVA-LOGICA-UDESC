package lista1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe a sua idade: ");
		int idade = s.nextInt();

		if (idade < 16) {
			System.out.println("Não eleitor");
		} else if (idade >= 18 && idade <= 65) {
			System.out.println("Eleitor Obrigatório");
		} else if (idade >= 16 && idade <= 17 || idade > 26) {
			System.out.println("Eleitor facultativo!");
		} else {
			System.out.println("Valor inválido!");
		}

	}

}

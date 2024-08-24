package lista3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double numero = 0;
		double positivo = 0;
		int contadorP = 0;
		int contadorN = 0;
		int intervalo = 0;
		double media = 0;

		for (int i = 0; i < 10; i++) {
			numero = 0;
			System.out.println("Informe um número: ");
			numero = s.nextDouble();

			if (numero >= 0) {
				contadorP++;
				positivo += numero;
			}

			if (numero < 0) {
				contadorN++;
			}

			if (numero >= 5 && numero <= 50) {
				intervalo++;
			}
		}

		media = positivo / contadorP;

		System.out.println("A média dos valores positivos lidos é: "+ media);
		System.out.println("A quantidade de valores menores que 0 são: "+ contadorN);
		System.out.println("A quantidade de valores que estão no intervalo de 5 a 50 é:"+ intervalo);
		
		s.close();
	}

}

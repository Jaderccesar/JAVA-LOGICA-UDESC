package lista1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe o saldo médio de um cliente: ");
		double saldoMedio = s.nextDouble();

		if (saldoMedio <= 200) {
			System.out.println("Saldo médio: " + saldoMedio + " \nNenhum crédito.");
		} else if (saldoMedio >= 201 && saldoMedio <= 400) {
			saldoMedio += saldoMedio * 0.2;
			System.out.println("Saldo médio: " + saldoMedio + " \nAumento de 20%.");
		} else if (saldoMedio >= 401 && saldoMedio <= 600) {
			saldoMedio += saldoMedio * 0.3;
			System.out.println("Saldo médio: " + saldoMedio + " \nAumento de 30%.");
		} else if (saldoMedio >= 601) {
			saldoMedio += saldoMedio * 0.4;
			System.out.println("Saldo médio: " + saldoMedio + " \nAumento de 40%.");
		} else {
			System.out.println("Valor inválido!");
		}

	}

}

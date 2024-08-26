package lista1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe a sua altura: ");
		double altura = s.nextDouble();
		System.out.println("Informe o seu peso: ");
		double peso = s.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau II");
		} else if (imc >= 40) {
			System.out.println("Obesidade grau III");
		} else {
			System.out.println("Valor invalido!");
		}

		s.close();

	}

}

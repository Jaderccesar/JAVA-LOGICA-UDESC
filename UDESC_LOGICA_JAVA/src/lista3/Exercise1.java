package lista3;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe qual tabuada você quer: ");
		int tabuada = s.nextInt();

		for (int i = 0; i <= 10; i++) {
			int resultado = tabuada * i;
			System.out.println(tabuada + " x " + i + " = " + resultado);
		}

		s.close();
	}
}

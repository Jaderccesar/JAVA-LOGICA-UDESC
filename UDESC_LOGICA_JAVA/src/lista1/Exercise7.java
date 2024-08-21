package lista1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = s.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número "+numero+ " é par.");
		}else {
			System.out.println("O número "+numero+ " é impar.");
		}

	}

}

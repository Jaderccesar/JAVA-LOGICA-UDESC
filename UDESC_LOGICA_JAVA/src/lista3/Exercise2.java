package lista3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int negativo = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o número");
			double numero = s.nextDouble();
			
			if(numero < 0) {
				negativo++;
			}
			
		}
		
		if(negativo == 1) {
			System.out.println("Você digitou "+negativo+" número negativo");
		}else if(negativo == 0) {
			System.out.println("Você não digitou nenhum número negativo");				
		}else {
			System.out.println("Você digitou "+negativo+" números negativos");
		}
		
		
		s.close();
	}

}

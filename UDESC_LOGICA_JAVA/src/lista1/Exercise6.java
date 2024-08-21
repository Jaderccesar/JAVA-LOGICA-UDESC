package lista1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Informe um número de 1 - 7 para imprimir o dia da semana correspondente a tal.");
			int diaSemana = s.nextInt();
			
			if(diaSemana == 1) {
				System.out.println("Domingo");
			}else if(diaSemana == 2) {
				System.out.println("Segunda-feira");
			}else if(diaSemana == 3) {
				System.out.println("Terça-feira");
			}else if(diaSemana == 4) {
				System.out.println("Quarta-feira");
			}else if(diaSemana == 5) {
				System.out.println("Quinta-feira");
			}else if(diaSemana == 6) {
				System.out.println("Sexta-feira");
			}else if(diaSemana == 7) {
				System.out.println("Sabado");
			}else {
				System.out.println("O número informado não representa nenhum dia da semana.");
			}
			
			
	}

}

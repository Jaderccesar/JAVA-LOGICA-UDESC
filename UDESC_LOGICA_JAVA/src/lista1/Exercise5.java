package lista1;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double calorias = 0;
		int verificado = 0;
		String prato = "";
		String bebida = "";
		String sobremesa = "";
		char continuacao = 'S';
		char verifica = ' ';

		do {
			System.out.println("Pratos válidos: Vegetariano - Peixe - Frango - Carne");
			System.out.println("Informe o prato: ");
			prato = s.nextLine();

			if (prato.toUpperCase().equals("VEGETARIANO") || prato.toUpperCase().equals("PEIXE")
					|| prato.toUpperCase().equals("FRANGO") || prato.toUpperCase().equals("CARNE")) {
				verificado = 1;
			} else {
				System.out.println("Entre com um prato válido!");
				System.out.println("Caso queira sair digite S ou qualquer outro botão para continuar");
				verifica = s.nextLine().toUpperCase().charAt(0);
				if (verifica == 'S') {
					break;
				}
			}

			if (verificado == 1) {
				System.out.println("Sobremesas válidas: Abacaxi - Sorvete diet - Mousse diet - Mousse chocolate");
				System.out.println("Informe a sobremesa: ");
				sobremesa = s.nextLine();

				if (sobremesa.toUpperCase().equals("ABACAXI") || sobremesa.toUpperCase().equals("SORVETE DIET")
						|| sobremesa.toUpperCase().equals("MOUSSE DIET")
						|| sobremesa.toUpperCase().equals("MOUSSE CHOCOLATE")
						|| sobremesa.toUpperCase().equals("MOUSSE DE CHOCOLATE")) {
					verificado = 1;
				} else {
					verificado = 0;
					System.out.println("Entre com uma sobremesa válida!");
					System.out.println("Caso queira sair digite S ou qualquer outro botão para continuar");
					verifica = s.nextLine().toUpperCase().charAt(0);
					if (verifica == 'S') {
						break;
					}
				}
			}

			if (verificado == 1) {
				System.out.println("Bebidas válidas: Chá - Suco de laranja - Suco de melão - Refrigerante diet");
				System.out.println("Informe a bebida: ");
				bebida = s.nextLine();

				if (bebida.toUpperCase().equals("CHÁ") || bebida.toUpperCase().equals("CHA")
						|| bebida.toUpperCase().equals("SUCO DE LARANJA")
						|| bebida.toUpperCase().equals("SUCO DE LIMÃO") || bebida.toUpperCase().equals("SUCO DE MELÃO")
						|| bebida.toUpperCase().equals("REFRIGERANTE DIET")) {
					verificado = 1;
				} else {
					verificado = 0;
					System.out.println("Entre com uma bebida válida!");
					System.out.println("Caso queira sair digite S ou qualquer outro botão para continuar ");
					verifica = s.nextLine().toUpperCase().charAt(0);
					if (verifica == 'S') {
						break;
					}
				}
			}
		} while (verificado == 0);

		if (prato.toUpperCase().equals("VEGETARIANO")) {
			calorias = 180;
		} else if (prato.toUpperCase().equals("PEIXE")) {
			calorias = 230;
		} else if (prato.toUpperCase().equals("FRANGO")) {
			calorias = 250;
		} else if (prato.toUpperCase().equals("CARNE")) {
			calorias = 350;
		}

		if (sobremesa.toUpperCase().equals("ABACAXI")) {
			calorias += 75;
		} else if (sobremesa.toUpperCase().equals("SORVETE DIET")) {
			calorias += 110;
		} else if (sobremesa.toUpperCase().equals("MOUSE DIET")) {
			calorias += 170;
		} else if (sobremesa.toUpperCase().equals("MOUSE CHOCOLATE")
				|| sobremesa.toUpperCase().equals("MOUSE DE CHOCOLATE")) {
			calorias += 200;
		}

		if (bebida.toUpperCase().equals("CHA") || bebida.toUpperCase().equals("CHÁ")) {
			calorias += 20;
		} else if (bebida.toUpperCase().equals("SUCO DE LARANJA")) {
			calorias += 70;
		} else if (bebida.toUpperCase().equals("SUCO DE MELÃO") || bebida.toUpperCase().equals("SUCO DE MELAO")) {
			calorias += 100;
		} else if (bebida.toUpperCase().equals("REFRIGERANTE DIET")) {
			calorias += 65;
		}

		if (verificado == 1) {
			System.out.println("Nessa refeição você comeu " + calorias + " calorias");
		}

		s.close();
	}
}

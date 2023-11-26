package exerciciosManzano;

import java.util.Scanner;
public class L02E {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor A:");
		int valorA = leia.nextInt();
		System.out.println("Informe o valor B:");
		int valorB = leia.nextInt();
		System.out.println("Informe o valor C:");
		int valorC = leia.nextInt();
		leia.close();
		double delta = (valorB * valorB) - 4 * (valorA * valorC);
		double valorPositivo = (-valorB) + Math.sqrt(delta) / (2 * valorA);
		double valorNegativo = (-valorB) - Math.sqrt(delta) / (2 * valorA);
		System.out.println(delta);
		
		if (valorA == 0) {
		    System.out.println("Equação de primeiro grau");
		} else if (delta >= 0) {
			System.out.println("O valor de X positivo é de: " + valorPositivo);
			System.out.println("O valor de X negativo é de: " + valorNegativo);
		} else{																	
			System.out.println("A equação não possui raizes reais");
		}
		
		
		
	}
}

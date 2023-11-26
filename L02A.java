package exerciciosManzano;

import java.util.Scanner;
public class L02A {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valorA = leia.nextInt();
		System.out.println("Informe outro valor");
		int valorB = leia.nextInt();
		leia.close();
		int maiorValor;
		int menorValor;
		
		if (valorA > valorB) {
			maiorValor = valorA;
			menorValor = valorB;
		}else {
			maiorValor = valorB;
			menorValor = valorB;
		}
		int resultado = maiorValor - menorValor;
		System.out.printf("A diferença do %d pelo %d é: %d", maiorValor,menorValor,resultado);
		
	}
}

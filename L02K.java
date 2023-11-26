package exerciciosManzano;

import java.util.Scanner;

public class L02K {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor = leia.nextInt();
		leia.close();
		if(valor<4) {
			System.out.println("O valor informado é: " + valor);
		}
	}
}

package exerciciosManzano;

import java.util.Scanner;

public class L02B {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor = leia.nextInt();
		leia.close();
		if(valor < 0) {
			System.out.println(valor*-1);
		} else {
			System.out.println(valor);
		}
	}
}

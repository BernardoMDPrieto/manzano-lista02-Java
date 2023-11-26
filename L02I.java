package exerciciosManzano;

import java.util.Scanner;
public class L02I {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor!");
		int valor = leia.nextInt();
		leia.close();
		if(valor%2 == 0) {
			System.out.printf("O valor %d é par",valor);
		}else {
			System.out.printf("O valor %d é impar",valor);
		}
	}
}

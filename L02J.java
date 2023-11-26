package exerciciosManzano;

import java.util.Scanner;

public class L02J {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor!");
		int valor = leia.nextInt();
		leia.close();
		if(valor > 0 && valor < 10) {
			System.out.println("O valor está dentro do valor permitido!");
		}else {
			System.out.println("O valor está fora do valor permitido!");
		}
		
	}
}

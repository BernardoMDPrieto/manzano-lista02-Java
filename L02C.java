package exerciciosManzano;

import java.util.Scanner;
public class L02C {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a primeira nota!");
		double nota01 = leia.nextDouble();
		System.out.println("Informe a segunda nota!");
		double nota02 = leia.nextDouble();
		System.out.println("Informe a terceira nota!");
		double nota03 = leia.nextDouble();
		System.out.println("Informe a quarta nota!");
		double nota04 = leia.nextDouble();
		leia.close();
		double media = (nota01+nota02+nota03+nota04)/4;
		if(media >= 5) {
			System.out.println("Aluno aprovado / nota: " + media);
		} else {
			System.out.println("Aluno reprovado / nota: " + media);
		}
	}
}

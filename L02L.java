package exerciciosManzano;

import java.util.Scanner;

public class L02L {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu nome");
		String nome = leia.next();
		System.out.println("Informe o seu sexo: M/F");
		String sexo = leia.next();
		System.out.println(sexo);
		leia.close();
		String mensagem = (sexo.equals("M"))?("Olá Illmo Sr."+nome):(sexo.equals("F"))?("Olá Imllma Sra."+nome):"Valor errado";
		System.out.println(mensagem);
	}
}

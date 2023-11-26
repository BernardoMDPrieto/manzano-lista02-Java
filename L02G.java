package exerciciosManzano;
import java.util.Scanner;
public class L02G {
	public static void main(String[]args) {
	Scanner leia = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
		System.out.println("Informe um valor!");
		int valor = leia.nextInt();
		if(valor%2 == 0 && valor%3 == 0) {
			System.out.printf("O %d é divisível por 2 e 3 %n",valor);
		}else {
			System.out.printf("O %d não é divisível por 2 e 3 %n",valor);
		}
	}
	leia.close();
	
	}
}

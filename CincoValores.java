package vetorArraylist;
import java.util.Scanner;

public class CincoValores {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num [] = new int [5];
		int soma=0;

		for (int i = 0; i<5; i++) {
			System.out.println("Digite um número: ");
			num[i] = ler.nextInt ();
			soma += num[i];
		}

		if (soma >= 30) {
			System.out.println("O resultado da soma é maior do que 30, o valor é: " + soma);
		}
		else {
			System.out.println("O resultado da soma é menor do que 30, o valor é: " + soma);
		}
		ler.close();
	}

}

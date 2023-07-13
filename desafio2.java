package segundo_desafio;

import java.util.Locale;
import java.util.Scanner;

/* SEGUNDO DESAFIO

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
necessárias.
Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido. */

public class desafio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		double valorInformado = sc.nextDouble();
		int inteiro = 0;		
			
		System.out.println("NOTAS:");
		inteiro = (int) valorInformado / 100;
		System.out.println(inteiro + " nota(s) de R$ 100.00");
		valorInformado = valorInformado % 100;
		
		inteiro = (int) valorInformado / 50;
		System.out.println(inteiro + " nota(s) de R$ 50.00");
		valorInformado = valorInformado % 50;
		
		inteiro = (int) valorInformado / 20;
		System.out.println(inteiro + " nota(s) de R$ 20.00");
		valorInformado = valorInformado % 20;
		
		inteiro = (int) valorInformado / 10;
		System.out.println(inteiro + " nota(s) de R$ 10.00");
		valorInformado = valorInformado % 10;
		
		inteiro = (int) valorInformado / 5;
		System.out.println(inteiro + " nota(s) de R$ 5.00");
		valorInformado = valorInformado % 5;
		
		inteiro = (int) valorInformado / 2;
		System.out.println(inteiro + " nota(s) de R$ 2.00");
		valorInformado = valorInformado % 2;
		
		System.out.println("MOEDAS:");
		inteiro = (int) (valorInformado / 1);
		valorInformado = valorInformado % 1;
		System.out.println(inteiro + " moedas(s) de R$ 1.00");
		
		inteiro = (int) (valorInformado / 0.5);
		valorInformado = valorInformado % 0.5;
		System.out.println(inteiro + " moedas(s) de R$ 0.50");
		
		inteiro = (int) (valorInformado / 0.25);
		valorInformado = valorInformado % 0.25;
		System.out.println(inteiro + " moedas(s) de R$ 0.25");
		
		inteiro = (int) (valorInformado / 0.10);
		valorInformado = valorInformado % 0.10;
		System.out.println(inteiro + " moedas(s) de R$ 0.10");
		
		inteiro = (int) (valorInformado / 0.05);
		valorInformado = valorInformado % 0.05;
		System.out.println(inteiro + " moedas(s) de R$ 0.05");
		
		inteiro = (int) (valorInformado / 0.01);
		valorInformado = valorInformado % 0.01;
		System.out.println(inteiro + " moedas(s) de R$ 0.01");
}
}

package primeiro_desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* PRIMEIRO DESAFIO

Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
o seguinte critério:
• Primeiro os Pares
• Depois os Ímpares
Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
em ordem decrescente.
Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o
número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada
uma delas, um valor inteiro não negativo.
Saída
Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
número deve ser impresso em uma linha, conforme exemplo abaixo. */

public class desafio1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);		 
		 ArrayList pares = new ArrayList();
		 ArrayList impares = new ArrayList();
		 
		System.out.print("Digite o números de entradas desejadas (Sendo ele maior que 1 ou menor/igual a 100000): ");
		int entradas = sc.nextInt();
		 
		for (int i = 0; i < entradas; i++) {
		 	System.out.print("Digite o número desejado: ");
			int numeros = sc.nextInt();
		 if (numeros % 2 == 0 && numeros >= 0) {
			 pares.add(numeros);
			 Collections.sort(pares);
		 } else {
			 impares.add(numeros);
			 Collections.sort(impares, Collections.reverseOrder());
		 }
		}
		
		System.out.println("Números pares em ordem crescente:" + pares);
		System.out.println("Números ímpares em ordem descrecente:" + impares);
		 

	}

}

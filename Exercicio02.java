package Exercicios0507;
import java.util.Scanner;

// Exercício 02

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, cont, par =0, impar = 0;
		
		for(cont = 1; cont <=10; cont++) {
			System.out.println("Escreva um número: ");
			num = ler.nextInt();
			if(num%2==0) {
				par++;
				
			}
			
			else {
				impar++;
			}
		}
		
	System.out.println(par + "Números pares foram digitados. ");
	System.out.println(impar + "Números impares foram digitados. ");
	
	
	}
}

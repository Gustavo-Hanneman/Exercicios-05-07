package Exercicios0507;
import java.util.Scanner;

// Exerc�cio 02

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, cont, par =0, impar = 0;
		
		for(cont = 1; cont <=10; cont++) {
			System.out.println("Escreva um n�mero: ");
			num = ler.nextInt();
			if(num%2==0) {
				par++;
				
			}
			
			else {
				impar++;
			}
		}
		
	System.out.println(par + "N�meros pares foram digitados. ");
	System.out.println(impar + "N�meros impares foram digitados. ");
	
	
	}
}

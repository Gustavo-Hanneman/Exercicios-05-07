package Exercicios0507;
import java.util.Scanner;

public class Exercicio04 {
		//Exercício04
	
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner read = new Scanner(System.in);
        
        int counter = 0;
        
        int calmo= 0, nervosoMulher = 0, agressivoHomem = 0;
        int nervosoMais40 = 0, calmoMenos18 = 0, calmoOutros = 0;
        
        
        while(counter < 149) {
            System.out.println("Digite sua idade: ");
            int idade = read.nextInt();
            
            System.out.println("Digite (1) Feminino (2) Masculino (3) Outros");
            int sexo = read.nextInt();
            
            System.out.println("Digite (1) Calme (2) Nervose (3) Agressive");
            int personalidade = read.nextInt();
            
            
            if(personalidade == 1) {
                calmo++;
                
                if(sexo == 3) {
                    calmoOutros++;
                }
                
                if(idade < 18) {
                    calmoMenos18++;
                }
            } else if(personalidade == 2) {
                
                if(sexo == 1) {
                    nervosoMulher++;
                }
                
                if (idade > 40) {
                    nervosoMais40++;
                }
            } else if(personalidade == 3) {
                if(sexo == 2) {
                    agressivoHomem++;
                }
            }
            counter++;
        }
        System.out.println("Pessoas calmas: " + calmo);
        System.out.println("Mulheres nervosas: " + nervosoMulher);
        System.out.println("Homens agressivos: " + agressivoHomem);
        System.out.println("Outros calmos: " + calmoOutros);
        System.out.println("Nervosos mais que 40: " + nervosoMais40);
        System.out.println("Calmos menos de 18: " + calmoMenos18);
    }
}


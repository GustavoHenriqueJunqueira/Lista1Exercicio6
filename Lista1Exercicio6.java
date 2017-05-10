package lista1exercicio6;

import java.util.Scanner;

public class Lista1Exercicio6 {

    public static void main(String[] args) {
    
        System.out.println("Programa para calcular a idade da pessoa");
        
        int anoatual, anonaci, idade;
        System.out.println("Digite o ano de seu nacimento: ");
        Scanner teclado = new Scanner(System.in);
        anonaci = teclado.nextInt();
        System.out.println("Digite o ano atual: ");
        anoatual = teclado.nextInt();
        
        idade = anoatual - anonaci;
        
        System.out.println("Sua idade é de: " +idade);
       
    }
    
}

package tec.thomaz.exerc;

import java.util.Scanner;

public class Exerc03 {
	
	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Saldo atual: ");
        double saldo = leitor.nextDouble();

        
        double novoSaldo = saldo * 1.01;

        System.out.printf("Seu novo saldo é: R$ %.2f", novoSaldo);

   
    }
}

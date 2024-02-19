// Comparador de Números: Escreva um programa que leia dois números e indique qual é o maior, o menor ou se são iguais.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro número:");
        num1 = dado.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = dado.nextInt();

        if (num1 > num2) {
            System.out.println(" O " + num1 + " é maior que " + num2 + ".");
        }

        else if (num1 < num2) {
            System.out.println("O " + num1 + " é menor que " + num2 + ".");
        }

        else {
            System.out.println("Os números digitados são iguais.");
        }

    }
}
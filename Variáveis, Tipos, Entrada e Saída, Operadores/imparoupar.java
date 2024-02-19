//Verificador de Par ou Ímpar: Crie um programa que leia um número inteiro e imprima se é par ou ímpar.

import java.util.Scanner;

public class imparoupar {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Declarando varíaveis

        int num;

        System.out.println("Digite um número:");
        num = dado.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par.");
        }

        else {
            System.out.println("O número é impar.");
        }

    }
}
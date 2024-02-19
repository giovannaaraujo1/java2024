// Calculadora de IMC: Crie um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. IMC = peso (kg) / (altura (m))^2.

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarando variáveis

        double peso, altura, imc;

        System.out.println("Digite o seu peso:");
        peso = sc.nextDouble();

        System.out.println("Agora digite a sua altura em metros:");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é:" + imc);
    }
}
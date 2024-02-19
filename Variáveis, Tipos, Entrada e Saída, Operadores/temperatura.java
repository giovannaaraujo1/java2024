//Conversão de Temperatura: Escreva um programa que converta temperatura de Celsius para Fahrenheit. A fórmula é F = C * 9/5 + 32.

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis

        double celsius, fahrenheit;

        // Texto de saída e leitura
        System.out.println("Digite uma temperatura em graus celsius:");
        celsius = sc.nextDouble();

        // Atribuindo valores
        fahrenheit = (celsius * 9 / 5) + 32;

        // Saída + resultado
        System.out.println("A temperatura em fahrenheit é:" + fahrenheit);

    }
}
// Cálculo de Área de Círculo: Escreva um programa que leia o raio de um círculo e 
//calcule sua área (A = πr^2). Use Math.PI para o valor de π.

import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Declarando variáveis
        double raio, area;

        // Lendo uma informação
        System.out.println("Digite o valor radial do seu círculo:");
        raio = dado.nextDouble();

        // Declarando uma formula
        area = Math.PI * raio * raio;

        // Expondo o resultado
        System.out.println("A área correspondente ao seu círculo é:" + area);
        area = dado.nextDouble();

    }
}
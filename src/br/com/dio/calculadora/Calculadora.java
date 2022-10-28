package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int a,b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        int soma = somar(a,b);
        int subtracao = subtrair(a,b);
        int multiplicacao = multiplicar(a,b);
        int divisao = dividir(a,b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scan.close();

    }

    public static int somar(int a, int b) {
        return (a + b);
    }

    public static int subtrair(int a, int b) {
        return (a - b);
    }

    public static int multiplicar(int a, int b) {
        return (a * b);
    }

    public static int dividir(int a, int b) {
        return (a / b);
    }
}

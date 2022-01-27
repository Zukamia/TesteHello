package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b; /*Float para usar numeros quebrados/decimais e int para inteiros*/

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextFloat();

        float somar = somar(a, b);
        float subtrair = subtrair(a, b);
        float multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("multi: " + multiplicar);
        System.out.print("divisão: " + dividir);


    }

    public static float somar(float a, float b) {

        return a + b;
    }

    public static float subtrair(float a, float b) {

        return a - b;
    }

    public static float multiplicar(float a, float b) {

        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }
}

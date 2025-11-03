package org.example;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisão por zero!");
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(5, 3));
        System.out.println("Divisão: " + calc.dividir(10, 2));
    }
}

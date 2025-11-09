package br.com.exemplo.calculadora;

/**
 * Classe que implementa operações matemáticas básicas.
 * Desenvolvida usando TDD (Test-Driven Development).
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * @param a primeiro número
     * @param b segundo número
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * @param a primeiro número
     * @param b segundo número
     * @return a subtração de a menos b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * @param a primeiro número
     * @param b segundo número
     * @return a multiplicação de a por b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     * @param a numerador
     * @param b denominador
     * @return a divisão de a por b como double
     * @throws IllegalArgumentException se b for zero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return (double) a / b;
    }
}
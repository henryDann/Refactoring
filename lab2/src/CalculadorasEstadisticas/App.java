package CalculadorasEstadisticas;

public class App {
    public static void main(String[] args) {
        double[] numeros = {10, 20, 30, 40, 50};
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        calculadora.calcularEstadisticas(numeros);
    }
}


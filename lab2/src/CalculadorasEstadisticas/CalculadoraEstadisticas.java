package CalculadorasEstadisticas;
public class CalculadoraEstadisticas {

    public void calcularEstadisticas(double[] numeros) {
        double media = calcularMedia(numeros);
        System.out.println("Media: " + media);

        double varianza = calcularVarianza(numeros, media);
        System.out.println("Varianza: " + varianza);

        double desviacion = calcularDesviacion(varianza);
        System.out.println("Desviación estándar: " + desviacion);
    }

    private double calcularMedia(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    private double calcularVarianza(double[] numeros, double media) {
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return sumaCuadrados / numeros.length;
    }

    private double calcularDesviacion(double varianza) {
        return Math.sqrt(varianza);
    }
}

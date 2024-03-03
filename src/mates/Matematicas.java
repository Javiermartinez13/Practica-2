package mates;

import java.util.Random;

public class Matematicas {

    public static double calcularPiIterativo(int pasos) {
        int puntosEnCirculo = 0;
        double areaCuadrado = 4;

        for (int i = 0; i < pasos; i++) {
            Random generador = new Random();
            double x = generador.nextDouble();
            double y = generador.nextDouble();

            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                puntosEnCirculo++;
            }
        }

        return areaCuadrado * puntosEnCirculo / pasos;
    }

    public static double calcularPiRecursivo(long pasos) {
        return calcularPiRecursivoAux(pasos, 1, 0);
    }

    private static double calcularPiRecursivoAux(long pasos, long actual, long puntosEnCirculo) {
        if (actual >= pasos) {
            double areaCuadrado = 4;
            return areaCuadrado * puntosEnCirculo / pasos;
        }

        Random generador = new Random();
        double x = generador.nextDouble();
        double y = generador.nextDouble();

        if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
            puntosEnCirculo++;
        }

        return calcularPiRecursivoAux(pasos, actual + 1, puntosEnCirculo);
    }
}

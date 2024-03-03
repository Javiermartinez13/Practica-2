package aplicacion;

import mates.Matematicas;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de puntos que desees: ");

        long totalPuntos = scanner.nextInt();

        System.out.println("Aproximación de PI: " + Matematicas.calcularPiRecursivo(totalPuntos));

        scanner.close();
    }
}

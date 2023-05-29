package ual.hmis.sesion05;

public class Ejercicio4 {
    public static int[][] obtenerDiagonales(int[][] matriz) {
        if (matriz.length != matriz[0].length)
            throw new RuntimeException("La matriz introducida no es cuadrada");
        int n = matriz.length;
        int[][] diagonales = new int[2][n];
        for (int i = 0; i < n; i++) {
            diagonales[0][i] = matriz[i][i];
            diagonales[1][i] = matriz[n - 1 - i][n - 1 - i];
        }
        return diagonales;
    }

    public static double[] sumarColumnas(double[][] matriz) {
        int n = matriz.length;
        double[] sumaColumnas = new double[n];

        for (int j = 0; j < n; j++) {
            double suma = 0.0;
            for (int i = 0; i < n; i++) {
                suma += matriz[i][j];
            }
            sumaColumnas[j] = suma;
        }

        return sumaColumnas;
    }
}

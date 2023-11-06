import java.util.Scanner;

public class MatrizMultiplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de la primera matriz: ");
        int filasA = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la primera matriz y filas de la segunda matriz: ");
        int columnasFilas = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la segunda matriz: ");
        int columnasB = sc.nextInt();

        if (columnasFilas <= 0) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            System.exit(0);
        }

        int[][] a = new int[filasA][columnasFilas];
        int[][] b = new int[columnasFilas][columnasB];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasFilas; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("La matriz A es:");
        imprimirMatriz(a);

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < columnasFilas; i++) {
            for (int j = 0; j < columnasB; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("La matriz B es:");
        imprimirMatriz(b);

        if (columnasFilas <= 0) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            System.exit(0);
        }

        int[][] c = multiplicacionMatrices(a, b);

        System.out.println("La matriz resultante de la multiplicación es:");
        imprimirMatriz(c);

        sc.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicacionMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
        return c;
    }
}
package BuclesFor2;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de filas");
        int iRows = sc.nextInt();
        System.out.println("Introduce el numero de columnas");
        int iColumns = sc.nextInt();
        // *****
        for (int i = 0; i < iColumns; i++) {
            for (int j = 0; j < (iRows - 1); j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

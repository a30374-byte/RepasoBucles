package FormatoSalida;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de 3 alumnos");
        String sName1 = sc.nextLine();
        String sName2 = sc.nextLine();
        String sName3 = sc.nextLine();

        System.out.println("Introduce la edad de los 3 alumnos, en orden");
        int iAge1 = sc.nextInt();
        int iAge2 = sc.nextInt();
        int iAge3 = sc.nextInt();

        System.out.printf("NOMBRE           EDAD%n");
        System.out.printf("---------------------%n");
        System.out.printf("%-15s %5d%n", sName1, iAge1);
        System.out.printf("%-15s %5d%n", sName2, iAge2);
        System.out.printf("%-15s %5d%n", sName3, iAge3);
    }
}

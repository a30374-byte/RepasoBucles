package FormatoSalida;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio de 3 productos");
        double dPrice1 = sc.nextInt();
        double dPrice2 = sc.nextInt();
        double dPrice3 = sc.nextInt();

        System.out.printf("Precio del producto 1: %.2f€ %n", dPrice1);
        System.out.printf("Precio del producto 1: %.2f€ %n", dPrice2);
        System.out.printf("Precio del producto 1: %.2f€ %n", dPrice3);
    }
}

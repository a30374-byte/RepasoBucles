package FormatoSalida;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cSecond = Character.MIN_VALUE;

        System.out.println("Introduce tu nombre");
        String sName = sc.nextLine();

        System.out.println("Introduce tu edad");
        int iAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce tu apellido");
        String sSurname = sc.nextLine();

        char cFirst = sSurname.charAt(0);
        for (int i = 0; i < sSurname.length(); i++) {
            char cCheckSlash = sSurname.charAt(i);

            if (cCheckSlash == '-' | cCheckSlash == ' ') {
                cSecond = sSurname.charAt(i + 1);
                int iNum = sSurname.length() - i;
            }
        }

        System.out.printf("Nombre: %s%n", sName);
        System.out.printf("Edad: %d años%n", iAge);
        System.out.printf("Inicial del apellido: %c%c", cFirst, cSecond);
    }
}

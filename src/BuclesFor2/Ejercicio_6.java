package BuclesFor2;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iDegrees;
        int iTotalDegrees = 0;
        int iCounter = 0;
        int iAvgDegrees;

        do {
            System.out.println("Introduce una temperatura");
            System.out.println("Introduce -100 para terminar");
            iDegrees = sc.nextInt();

            if (iDegrees != -100) {
                iTotalDegrees += iDegrees;
                iCounter++;
            }

        }
        while (iDegrees != -100);

        iAvgDegrees = iTotalDegrees / iCounter;

        System.out.println("La temperatura total es: " + iTotalDegrees);
        System.out.println("Has introducido " + iCounter + " temperatura(s).");
        System.out.println("La temperatura media es: " + iAvgDegrees);
    }
}

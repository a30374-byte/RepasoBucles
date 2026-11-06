package BuclesFor2;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum;

        do {
            System.out.println("Introduce un numero entero positivo");
            iNum = sc.nextInt();
        }
        while (iNum < 0);

        if (iNum == 0){
            System.out.println("¿¡QUÉ HAS HECHO!?");
            for (int i = 0; i < 10; i++) {
                System.out.println("CERO");
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(iNum * (i + 1));
        }
    }
}

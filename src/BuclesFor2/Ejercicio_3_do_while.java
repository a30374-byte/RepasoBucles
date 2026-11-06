package BuclesFor2;

import java.util.Scanner;

public class Ejercicio_3_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iPrecio;
        int iPrecioTotal = 0;
        int iCounter = 0;

        do {
            System.out.println("Introduce un precio");
            System.out.println("Introduce 0 para terminar");

            iPrecio =  sc.nextInt();

            iPrecioTotal = iPrecio + iPrecioTotal;

            if (iPrecio != 0){
                iCounter++;
            }
        }
        while (iPrecio != 0);

        System.out.println("El precio total es: " + iPrecioTotal);
        System.out.println("El total de artículos es: " + iCounter);
    }
}

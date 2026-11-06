package BuclesFor2;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sLonger = ""; // sLonger siempre será la menor al principio
        String sWord;
        int iCounter = 0;

        do {
            // Pedimos introducir una palabra hasta que introduzca una palabra o ponga fin
            do {
                System.out.println("Introduce una palabra");
                System.out.println("Introduce 'fin' para terminar");
                sWord = sc.nextLine();

                if(sWord.isEmpty()){
                    System.out.println("No has introducido una palabra");
                }
            }
            while(sWord.isEmpty());

            // Si no hemos introducido fin, conteo +1 y check palabra
            if (!sWord.equals("fin")) {
                iCounter++;

                if (sWord.length() > sLonger.length()) {
                    sLonger = sWord;
                }
            }

        }
        while (!sWord.equals("fin"));

        // Caso excepción para cuando introducimos fin directamente
        if (iCounter == 0){
            System.out.println("No has introducido ninguna palabra");
            return;
        }

        System.out.println("La palabra más larga es: " + sLonger);

    }
}

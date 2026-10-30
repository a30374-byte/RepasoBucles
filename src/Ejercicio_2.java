import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una carácter por teclado");
        String sCharacter = sc.next();

        char cChar = sCharacter.charAt(0);

        if (cChar > 64 && cChar < 91){
            System.out.println("El carácter introducido está en mayúsculas.");

            return;
        }
        System.out.println("El carácter introducido no es una letra en mayúsculas");
    }
}

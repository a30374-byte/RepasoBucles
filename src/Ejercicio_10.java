import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sPalabra = "";
        int iCheck = 1;

        while (iCheck != 0) {
            System.out.println("Deletrea una palabra");
            String sInput = sc.nextLine();

            char cChar = sInput.charAt(0);

            sPalabra = sPalabra + cChar;

            System.out.println("Inserta 0 si has terminado");
            iCheck = sc.nextInt();
            sc.nextLine(); // Salta a la siguiente linea, para evitar que el String coja el 0 como input
        }
        System.out.println(sPalabra);
    }
}

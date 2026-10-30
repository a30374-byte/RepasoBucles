import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iContrasenya = 1234;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la contraseña numérica");
            int iContrasenyaInput = sc.nextInt();

            if (iContrasenyaInput == iContrasenya){
                System.out.println("Acceso Permitido");

                return;
            }

            System.out.println("Contraseña Incorrecta");
            System.out.println("Quedan " + (4 - i) + " intentos.");

            if (i == 4){
                System.out.println("Apagando programa");
            }


        }
    }
}

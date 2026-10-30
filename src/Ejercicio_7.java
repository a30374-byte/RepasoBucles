import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iContrasenya = 1234;
        int iContrasenyaInput = 0;

        do{
            System.out.println("Introduce la contraseña");
            iContrasenyaInput = sc.nextInt();

            if (iContrasenya == iContrasenyaInput){
                System.out.println("Acceso Permitido");
            }
            else {
                System.out.println("Contraseña incorrecta");
            }
        }
        while (iContrasenyaInput != 1234);
    }
}

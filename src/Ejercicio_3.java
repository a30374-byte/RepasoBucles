import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dPrecio = 2;

        System.out.println("Cuantas horas ha estado el coche estacionado?");
        int iHorasEstacionado = sc.nextInt();

        if (iHorasEstacionado > 8){
            dPrecio = 12;

            System.out.println("El Importe Final es: " + dPrecio + " €.");

            return;
        }

        switch (iHorasEstacionado){
            case 0:
                dPrecio = 0;

                System.out.println("El importe final es " + dPrecio + " €.");

                break;
            case 1:
                System.out.println("El importe final es " + dPrecio + " €.");

                break;
            default:
                dPrecio = 1.5 * iHorasEstacionado;

                System.out.println("El importe final es " + dPrecio + " €.");
        }
    }
}

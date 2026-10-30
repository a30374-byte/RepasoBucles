import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dImporteCompra = 0;
        double dImporteTotal = 0;

        do{
            System.out.println("Introduce el importe de compra");
            dImporteCompra = sc.nextDouble();

            double dGastosEnvio = 0;

            if (dImporteCompra < 50){
                dGastosEnvio = 4.95;
            }

            dImporteTotal = dImporteCompra + dGastosEnvio;

            System.out.println("Importe de Compra: " + dImporteCompra + " €.");
            System.out.println("Gastos de Envío: " + dGastosEnvio + " €.");
            System.out.println("Importe Total: " + dImporteTotal + " €.");
        }
        while (dImporteCompra < 0);


    }
}
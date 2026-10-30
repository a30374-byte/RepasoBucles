import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dPotencia;

        System.out.println("Introduce la base");
        double dBase = sc.nextInt();

        System.out.println("Introduce el máximo exponente");
        double dExpo = sc.nextInt();

        for (int i = 1; i < dExpo; i++) {
            dPotencia = Math.pow(dBase, i);

            System.out.println((int)dPotencia);
        }
    }
}

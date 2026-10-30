import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iConteo = 0;
        int iNum = 0;

        while (iNum < 100){
            System.out.println("Introduce un número entero");
            int iInput = sc.nextInt();

            iNum = iNum + iInput;
            iConteo += 1;
        }
        System.out.println("Has introducido " + iConteo + " números.");
        System.out.println("El número es " + iNum);
    }
}

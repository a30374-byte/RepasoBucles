import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iCociente = 0;

        System.out.println("Introduce el dividendo");
        int iDividendo = sc.nextInt();
        int iDividendoOriginal = iDividendo;

        System.out.println("Introduce el divisor");
        int iDivisor = sc.nextInt();

        while (iDividendo > 0){
            iDividendo = iDividendo - iDivisor;
            System.out.println(iDividendo);

            iCociente++;
        }

        int iResto = iDividendoOriginal - (iDivisor * iCociente);

        System.out.println("El cociente es: " + iCociente);
        System.out.println("El resto es: " + iResto);
    }
}

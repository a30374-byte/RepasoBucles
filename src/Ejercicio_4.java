import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iContadorEsLaborable = 0;

        System.out.println("Introduce un número del 1 al 7, correspondiente a un día del a semana (1 Lunes, " +
                "2 Martes, etc.)");
        int iDiaSemana = sc.nextInt();

        if (iDiaSemana >= 1 && iDiaSemana < 6){
            iContadorEsLaborable = 1;
        }
        else {
            iContadorEsLaborable = 2;
        }

        switch (iContadorEsLaborable){
            case 1:
                System.out.println("Es día laborable");
                break;
            case 2:
                System.out.println("Es día de fin de semana");
                break;
            default:
                System.out.println("Eso no es un día");
        }
    }
}

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iHoraInicioActividad1 = 1;
        int iHoraFinalActividad1 = 1;
        int iHoraInicioActividad2 = 1;
        int iHoraFinalActividad2 = 1;

        do {
            System.out.println("A qué hora empieza la primera actividad?");
            iHoraInicioActividad1 = sc.nextInt();
        }
        while (iHoraInicioActividad1 < 0 || iHoraInicioActividad1 > 24);

        do{
            System.out.println("A qué hora termina la primera actividad?");
            iHoraFinalActividad1 = sc.nextInt();
        }
        while (iHoraFinalActividad1 < 0 || iHoraFinalActividad1 > 24);

        do {
            System.out.println("A qué hora empieza la segunda actividad?");
            iHoraInicioActividad2 = sc.nextInt();
        }
        while (iHoraInicioActividad2 < 0 || iHoraInicioActividad2 > 24);

        do{
            System.out.println("A qué hora termina la segunda actividad?");
            iHoraFinalActividad2 = sc.nextInt();
        }
        while (iHoraFinalActividad2 < 0 || iHoraFinalActividad2 > 24);

        if ((iHoraInicioActividad2 >= iHoraInicioActividad1 && iHoraInicioActividad2 <= iHoraFinalActividad1) ||
                (iHoraInicioActividad1 >= iHoraInicioActividad2 && iHoraInicioActividad1 <= iHoraInicioActividad2) ||
                (iHoraFinalActividad1 >= iHoraInicioActividad2 && iHoraFinalActividad1 <= iHoraFinalActividad2) ||
                (iHoraFinalActividad2 >= iHoraInicioActividad1 && iHoraFinalActividad2 <= iHoraFinalActividad1)){
            System.out.println("The activities overlap");

            return;
        }
        System.out.println("The activities don't overlap");
    }
}

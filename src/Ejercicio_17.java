
import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] aDado = new String[189];

        for (int i = 0; i < 4; i++) {
            double dDado = Math.random() * 6;
            int iDadoSave = (int)dDado + 1;
            String sDado = Integer.toString(iDadoSave);

            aDado[i] = sDado;

            for (int j = 0; j < aDado.length; j++) {
                System.out.println(aDado[j]);
            }
        }
    }
}

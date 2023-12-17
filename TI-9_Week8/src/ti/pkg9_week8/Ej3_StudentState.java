
package ti.pkg9_week8;
import java.util.Scanner;
public class Ej3_StudentState {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[estudiantes.length];

        for (int i = 0; i < promediosCualitativos.length; i++) {
            if (promedios[i] <= 5.9 && promedios[i] >= 0) {
                System.out.printf("%s con promedio: %.2f es un estudiante Regular \n",estudiantes[i],promedios[i]); 
        }   else if (promedios[i] <= 8.9 && promedios[i] >= 6) {
                    System.out.printf("%s con promedio: %.2f es un estudiante Bueno \n",estudiantes[i],promedios[i]); 
        }       else if (promedios[i] <= 10 && promedios[i] >= 9) {
                        System.out.printf("%s con promedio: %.2f es un estudiante Sobresaliente \n",estudiantes[i],promedios[i]);
        }
    }
}
}


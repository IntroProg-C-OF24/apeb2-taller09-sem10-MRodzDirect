package ti.pkg9_week8;
public class Ej5_Bimester3_dot_O {
    public static void main(String[] args) {
        
        int limEsts = 28, estEnc=0, estDeb=0;
        
        double notasEsts [] = new double [limEsts];
        double sumaNotas =0, promedioNotas = 0, notaMax, notaMin ;
      
        
        for (int i = 0; i < notasEsts.length; i++) {
       
            notasEsts[i] = (double) (Math.random ()*(9-0+1)+0);
            sumaNotas += notasEsts[i];
        // printf : %s = cadena, %f = float ; %.xf = only x decimals , %d = entero
        }
        promedioNotas = sumaNotas / notasEsts.length;
        
        notaMax= notasEsts[0];
        notaMin= notasEsts[0];
        for (int i = 1; i < notasEsts.length; i++) {
            
        // if-ternario edition 0.1    
        //    notaMax = (notasEsts[i]>notaMax)? notasEsts[i] : notasEsts [i-1];

            if (notasEsts[i]>notaMax) {
                notaMax= notasEsts[i];
            }
            else if (notasEsts[i]<notaMin){
                notaMin= notasEsts[i];
            }
            if (notasEsts[i]>promedioNotas){
                System.out.println("Estudiante por encima del promedio :");
                System.out.printf("Estudiante %d: con nota %2f \n \n", (i+1), notasEsts[i]);
                estEnc++;
                }
            else if (notasEsts[i]<=promedioNotas){
                System.out.println("Estudiantes por debajo o igual al promedio son:");
                System.out.printf("Estudiante %d: con nota %2f \n \n", (i+1), notasEsts[i]);
                estDeb++;
        }       
        }
        System.out.printf("El total de estudiantes encima del promedio son: %d y debajo o igual al promedio hay: %d \n",estEnc,estDeb);
        System.out.printf("El promedio del paralelo C es: %.2f \n",promedioNotas);
        System.out.printf("El estudiante con mejor nota tiene: %.2f y la peor nota es: %.2f \n", notaMax, notaMin);
    
}
}
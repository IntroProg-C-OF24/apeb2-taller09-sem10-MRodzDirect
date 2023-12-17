package ti.pkg9_week8;
public class Ej5_Bimester3_dot_O {
    public static void main(String[] args) {
        
        int limEsts = 10;
        
        double notasEsts [] = new double [limEsts];
        double sumaNotas =0, promedioNotas = 0, notaMax, notaMin, notasEstz ;
      
        
        for (int i = 0; i < notasEsts.length; i++) {
       
            notasEsts[i] = (double) (Math.random ()*(9-0+1)+0);
        }
        for (int i = 0; i < notasEsts.length; i++) {
            System.out.printf("%s %d: %.2f \n", "Estudiante",(i+1) ,notasEsts[i]);
            // printf : %s = cadena, %f = float ; %.xf = only x decimals , %d = entero
    }
        for (int i = 0; i < notasEsts.length; i++) {
            sumaNotas += notasEsts[i];   
        }
        promedioNotas = sumaNotas / notasEsts.length;
        System.out.printf("Promedio: %.2f \n",promedioNotas);
            
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
        }
        System.out.println("Nota mayor: "+notaMax);
        System.out.println("Nota menor: "+notaMin);
        
        for (int i = 0; i < notasEsts.length; i++) {
            if (notasEsts[i]>promedioNotas){
                System.out.println("Estudiante por encima del promedio:");
                System.out.printf("Estudiante %d: con nota %2f \n \n", (i+1), notasEsts[i]);}
            if (notasEsts[i]<promedioNotas){
                System.out.println("Estudiante por debajo del promedio:");
                System.out.printf("Estudiante %d: con nota %2f \n \n", (i+1), notasEsts[i]);
            }
                
        }
    
}
}
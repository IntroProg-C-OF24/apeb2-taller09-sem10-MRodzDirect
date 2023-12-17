
package Ej5_Bimester3;
import java.util.Scanner;
import java.util.Random;

public class Ej5_Bimester3dot0 {
    public static void main(String[] args) {
        int limEst = 28;
        double sum=0, prom=0, notaMax=0, notaMin=0;
        double notaEst[] = new double [limEst];
        Scanner sc = new Scanner (System.in);
        Random r = new Random();
        
        for ( nota : notaEst) {
            nota = r.nextDouble(0.01,10)+1;
            notaEst[i] = nota;
            sum += nota;
        }
        prom = sum/notaEst.length;
        notaMax=notaEst[0];
        notaMin=notaEst[0];
        
        for (double nota : notaEst){
            if (nota<notaMax){
                notaMax=nota;
                
        }
                
    }
}
}
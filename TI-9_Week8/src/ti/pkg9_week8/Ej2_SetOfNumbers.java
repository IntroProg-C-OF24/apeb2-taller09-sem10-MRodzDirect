package ti.pkg9_week8;
import java.util.Scanner;
public class Ej2_SetOfNumbers {
    public static void main(String[] args) {
        int prom=0, sum=0, i=0, morePromedy=0, lessPromedy=0, samePromedy=0;
        int set[] = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        
        for (i = 0; i < set.length; i++) {
            sum+= set[i];
        }
        prom = sum/set.length;
        for (i = 0; i < set.length; i++) {
            if (set[i]>prom){
                System.out.println(set[i]+" es mayor al promedio");
                morePromedy++;
            }
            else if (set[i]<prom){
                System.out.println(set[i]+" es menor al promedio");
                lessPromedy++;
            } else if (set[i]==prom){
                System.out.println(set[i]+" es igual al promedio");
                samePromedy++;
            }
        }
        System.out.println("Numeros por encima del promedio son: "+morePromedy);
        System.out.println("Numeros por debajo del promedio son: "+lessPromedy);
        System.out.println("Numeros igual que el promedio son: "+samePromedy);
        }
    }

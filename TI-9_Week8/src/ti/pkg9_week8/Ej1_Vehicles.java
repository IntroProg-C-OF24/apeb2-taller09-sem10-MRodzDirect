package ti.pkg9_week8;
import java.util.Scanner;
public class Ej1_Vehicles {

    public static void main(String[] args) {
        int array =0;
        int i =0;
        int size;
        String marca;
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos vehiculos desea ingresar");
        size = sc.nextInt();
        String carros[] = new String [size];
        
        for (i = 0; i <= carros.length-1; i++) {
            System.out.println("Ingrese la marca de vehiculo preferida");
            marca = sc.next();
            if (!marca.startsWith("C")&&!marca.startsWith("A")&&!marca.startsWith("T")){
            carros[i]= marca;
        }
        }
	for (i = 0; i < carros.length; i++) {
            if (carros[i]!=null)
            System.out.printf("Las marcas ingresadas son: %s \n",carros[i]);
        }
    }
    
}
// Por El MRodz 😉 💚

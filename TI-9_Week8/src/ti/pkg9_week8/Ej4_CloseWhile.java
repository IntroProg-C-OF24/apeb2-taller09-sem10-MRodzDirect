
package ti.pkg9_week8;
import java.util.Scanner;

public class Ej4_CloseWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
int i;
    
while(bandera){
 System.out.println("Ingrese una letra");
    inicial = sc.nextLine();
    for (i=0 ; i < estudiantes.length ; i++){
    // Pre-research : if (!inicial.startsWith("K")&&!inicial.startsWith("H")&&!inicial.startsWith("T")&&!inicial.startsWith("L")&&!inicial.startsWith("M")&&!inicial.startsWith("J")&&!inicial.startsWith("A")){
    String est = estudiantes[i];
    if (inicial.equals(estudiantes[i].substring(0,1))){
    bandera = false;
    }
    }
}
    }
}

package programas;
import java.util.Scanner;
public class Sueldos {
 public static void main(String[] args) {
        // Declaracion de Variables
        String e1,e2,e3,e4,e5;
        double s1,s2,s3,s4,s5,ts,sp;
        Scanner lectura= new Scanner(System.in);
        //Entrda de Datos
        System.out.print("Sueldo del empleado1: ");
        s1=lectura.nextDouble();
        System.out.print("Sueldo del empleado2: ");
        s2=lectura.nextDouble();
        System.out.print("Sueldo del empleado3: ");
        s3=lectura.nextDouble();
        System.out.print("Sueldo del empleado4: ");
        s4=lectura.nextDouble();
        System.out.print("Sueldo del empleado5: ");
        s5=lectura.nextDouble();
        //Proceso de datos
        ts=s1+s2+s3+s4+s5;
        sp=ts/5;
        //Salida de datos
        System.out.println("El total de sueldos es: "+ts);
        System.out.println("El sueldo Promedio es : "+sp);   
    }
}

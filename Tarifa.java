
package programas;

import java.util.Scanner;
public class Tarifa {
    public static void main(String[] args) {
        // Declaracion de Variables
        String empleado;
        double ht,th,sb,d,sn;
        Scanner lectura= new Scanner(System.in);
        //Entrda de Datos
        System.out.print("Nombre del empleado: ");
        empleado=lectura.next();
        System.out.print("Horas Trabajadas: ");
        ht=lectura.nextDouble();
        System.out.print("Tarifa por hora: ");
        th=lectura.nextDouble();
         //Proceso de datos
         sb=th*ht;
         d=sb*0.13;
         sn=sb-d;
         //Salida de Datos
         System.out.println("Sueldo Bruto: "+sb);
        System.out.print("Descuento : "+d);
        System.out.print("Sueldo Neto : "+sn);

    
    }
}

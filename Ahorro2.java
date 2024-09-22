
package programas;

import java.util.Scanner;
public class Ahorro2 {
    public static void main(String[] args) {
        // Declaracion de Variables
        String empleado,cargo;
        double ingreso,gasto,ahorrom,ahorroa,ahorrob,ahorros;
        //creacion de objeto de lectura
        Scanner lectura= new Scanner(System.in);
        //Entrda de Datos
        System.out.print("Nombre del empleado: ");
        empleado=lectura.next();
        System.out.print("Cargo del empleado: ");
        empleado=lectura.next();
        System.out.print("Ingresos del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print("Gastos del empleado: ");
        gasto=lectura.nextDouble();
        //Proceso de datos
        ahorrom=ingreso-gasto;
        ahorroa=ahorrom*12;
        ahorrob=ahorrom*2;
        ahorros=ahorrom*6;
        //Salida de datos
        System.out.println("Ahorro Mensual es: "+ahorrom);
        System.out.println("Ahorro Bimestral es: "+ahorrob);
        System.out.println("Ahorro Semestral es: "+ahorros);
        System.out.print("Ahorro anual es: "+ahorroa);
    }
    
}

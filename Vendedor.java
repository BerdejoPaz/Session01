
package programas;

import java.util.Scanner;
public class Vendedor {
 public static void main(String[] args) {
        // Declaracion de Variables
        String vendedor;
        double sm,pt,c;
        int vt1,vt2,vt3;
        Scanner lectura= new Scanner(System.in);
        //Entrda de Datos
        System.out.print("Nombre del Vendedor: ");
        vendedor=lectura.next();
        System.out.print("sueldo Mensual: ");
        sm=lectura.nextDouble();
        System.out.print("Ingrese Venta1: ");
        vt1=lectura.nextInt();
        System.out.print("Ingrese Venta2: ");
        vt2=lectura.nextInt();
        System.out.print("Ingrese Venta3: ");
        vt3=lectura.nextInt();
         //Proceso de datos
         c=(vt1+vt2+vt3)*0.10;
         pt=sm+c;
         //Salida de Datos
         System.out.println("La  comision de la venta es: "+c);
        System.out.print("El sueldo Mensual del Vendedor es : "+pt);
  }   
}

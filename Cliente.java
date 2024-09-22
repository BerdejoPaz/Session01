package programas;

import java.util.Scanner;
public class Cliente {
    public static void main(String[] args) {
        // Declaracion de Variables
        String cliente, producto;
        double precio,igv,tp,st;
        int cantidad;
        //creacion de objeto de lectura
        Scanner lectura= new Scanner(System.in);
        //Entrda de Datos
        System.out.print("Nombre del Cliente: ");
        cliente=lectura.next();
        System.out.print("Nombre del Producto: ");
        producto=lectura.next();
        System.out.print("Ingresa el Precio: ");
        precio=lectura.nextDouble();
        System.out.print("Ingresa la cantidad: ");
        cantidad=lectura.nextInt();
        //Proceso de datos
        st=cantidad*precio;
        igv=st*0.18;
        tp=st+igv;
        //Salida de datos
        System.out.println("El subTotal es: "+st);
        System.out.println("El IGV es : "+igv);
        System.out.println("El Total a Pagar es: "+tp);
       }
 }

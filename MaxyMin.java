package programas;
import java.util.Scanner;
public class MaxyMin {
public static void main(String[] args) {
  int n1,n2,maximo,minimo;
  Scanner lectura=new Scanner (System.in);
  System.out.print("Ingrese numero 1: ");
  n1=lectura.nextInt();
  System.out.print("Ingrese numero2 : ");
  n2=lectura.nextInt();
  maximo=Math.max(n1,n2);
  minimo=Math.min(n1,n2);
  System.out.println("El Maximo numero es "+maximo);
 System.out.println("El Minimo numero es "+minimo);
 }    
}

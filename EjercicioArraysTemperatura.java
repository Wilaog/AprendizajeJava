
/* En tres vectores diferentes se guardan los nombres, temperaturas minimas y 
 * maximas de la provincia de Misiones. En el primer vector se guardan los nombres
 * de las ciudades, en el segundo las temperaturas minimas alcanzadas y en el 
 * tercero las temperaturas maximas alcanzadas en la ultima semana.
 * Se necesita un programa qye permita la carga de las ciudades, sus temperaturas 
 * minimas y maximas; ademas, debera poder informar por pantalla cual fue la ciudad
 * con la temperatura mas baja y mas alta(dando a conocer al mismo tiempo
 * la cantidad de grados.)
 */

import java.util.Scanner;

public class EjercicioArraysTemperatura {
  public static void main(String[] args) {
    
    //Creamos los 3 vectores(variables)
String ciudades[] = new String[5];
Double minimas [] = new Double[5];
Double maximas [] = new Double[5];

Scanner teclado = new Scanner (System.in);
Scanner teclado2 = new Scanner (System.in);

//Cargar los vectores
for (int i=0; i<ciudades.length; i++) {
    System.out.println("Ingrese el nombre de la ciudad " + i);
    ciudades[i] = teclado.nextLine();

    System.out.println("Ingrese la temperatura minima de la ciudad " + i);
    minimas[i] = teclado2.nextDouble();

    System.out.println("Ingrese la temperatura maxima de la ciudad " + i);
    maximas[i] = teclado2.nextDouble();
    }
    
    Double minima = 9999999.00;
    int posMin = -1;
    //Determinamos la minima
    for (int i=0; i<minimas.length; i++) {

      if (minimas[i] < minima) {
        minima = minimas[i];
        posMin = i;

      }
    }
    Double maxima = -999999.00;
    int posMax = -1;
    //Determnamos la maxima
    for (int i=0; i<maximas.length; i++) {

      if (maximas[i] > maxima) {
        maxima = maximas[i];
        posMax = i;

     }
   }
System.out.println("La temperatura minima es de: " + minima);
System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
System.out.println("La temperatura maxima es de: " + maxima);
System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);
  }
}

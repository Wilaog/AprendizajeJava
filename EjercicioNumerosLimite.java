
/*Ejecicio estructuras repetitivas
Realizar un programa que dado por teclado un limite numerico por teclado (por ejemplo hasta 100) 
muestre en pantalla todos los numero hasta ese limite(empezando por 1) */

import java.util.Scanner;

public class EjercicioNumerosLimite {

public static void main(String[] args) {
    
   // ingresar limite
   System.out.println("ingrese el limite hasta el que quiere llegar");
   Scanner teclado = new Scanner(System.in);
   int limite = teclado.nextInt();
   int contador = 1;

   while (contador <= limite) {

    System.out.println(contador);
    contador = contador + 1;
    // contador++ es lo mismo a lo anterior

   }

 }

}


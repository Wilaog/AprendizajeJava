
/*Ejercicio integrados de condicionales
 * Una pequeña despensa desea calcular los sueldos de sus empleados. 
 * Los puestos de los mismos pueden tener 3 categorias. 
 * 1: repositor: $15890 + un bono de 10%
 * 2: cajero : $25630.89 fijo
 * 3: supervisor: $35560.20 en bruto menos descuento 11% junilacion.
 * se necesita un programa que, dependiendo del tipo de empleado del que se trate, 
 * calcule y muestre en pantalla el correspondiente sueldo.
 */

import java.util.Scanner;

public class EjercicioIntegrador_condicionales {

    public static void main(String[] args) {
        
        double sueldo=0;
        int categoria;

        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
        Scanner teclado = new Scanner (System.in); 
        categoria = teclado.nextInt();
    
        if (categoria == 1) {
            sueldo = 15890 + (15890*0.10);
        }
        else {
            if (categoria == 2) {

                sueldo = 25630.89;
            }
            else{
                if (categoria == 3) {
                    sueldo = 35560.20 - (35560.20*0.11);
                }
                else{
                    System.out.println("Debe ingresar un numero de categoria valido");
                }
            }
        }
        if (categoria == 1 || categoria == 2 || categoria == 3 ) {
        System.out.println("El total del sueldo para la categoria seleccionada" + categoria + " es igual a: " + sueldo);
    }
    }
}

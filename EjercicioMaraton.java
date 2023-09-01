import java.util.Scanner;

public class EjercicioMaraton {
    
public static void main(String[] args) {
    
// Pedir datos a las personas dni, nombre, edad
// Determinar a que categoria se debe inscribir
// Informarle a la persona
// No sabemos la cantidad de personas

// pido dni
System.out.println("Ingrese el dni de la persona");
Scanner teclado = new Scanner (System.in);
String dni = teclado.nextLine();
//pido nombre
System.out.println("Ingrese el nombre de la persona");
String nombre = teclado.nextLine();
//pido edad
System.out.println("Ingrese la edad de la persona");
Scanner teclado2 = new Scanner (System.in);
int edad = teclado2.nextInt();

// No funciona la condicion ||(OR) por la tabla de verdad, es por eso que con &&(Y) se da la condicion que solicitamos.

while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {

    /*Menores A (de 6 a 10 años)
     * Menores B (de 11 a 17 años)
     * Juveniles (de 18 a 30 años)
     * Adultos (de 31 a 50 años)
     * Adultos mayores (mayores de 50 años)
     */

     if (edad >= 6 && edad <= 10) {
        System.out.println("La categoria es Menores A.");
     }
     else {
        if (edad >= 11 && edad <= 17) {
            System.out.println("La categoria es Menores B.");
        }
        else {
            if (edad >= 18 && edad <= 30) {
                System.out.println("La categoria es juveniles.");
            }
            else{
                if (edad >= 31 && edad <= 50) {
                    System.out.println("La categoria es adultos.");
                }
                else {
                    if (edad >= 51) {
                        System.out.println("La caetgoria es adultos mayores");
                    }
                    else{
                        System.out.println("La persona no cuenta con la edad indicada");
                    }
                }
            }
        }
     }

// Se piden al final nuevamente los datos para evitar que sea un bucle infinito
System.out.println("Ingrese el dni de la persona");
dni = teclado.nextLine();

System.out.println("Ingrese el nombre de la persona");
nombre = teclado.nextLine();

System.out.println("Ingrese la edad de la persona");
edad = teclado2.nextInt();

}

}

}


// Realizar un programa que permita el intercambio de valores entre dos variables. Por ejemplo
// si una variable numero vale 35, y unq variable numero2 vale 20, realizar las acciones necesarias
// para que el numero pase a valer 20 y numero2 pase a valer 35. 
// Una vez realizado el cambio mostrar el resultado por pantalla.

// Lo podemos resolver mediante una variable auxiliar

public class EjercicioLogica1 {

public static void main (String[] args) {

 int num1 = 35;
 int num2 = 20;
 int aux;

 System.out.println("-----Antes-----");
 System.out.println("num1: " + num1);
 System.out.println("num2: " + num2);

 aux = num2;
 num2 = num1;
 num1 = aux;

 System.out.println("-----Despues-----");
 System.out.println("num1: " + num1);
 System.out.println("num2: " + num2);

  }

}
public class Condicional_switch {

/*Estructura switch: Permite multiples caminos a partir de la evaluacion 
de una sola expresion/condicion.

* La expresion puede ser una variable o cualquier otro tipo 
siempre y cuando se evalue un valor simple. La condicion se ejecuta mediante 
la evaluacion de la condicion y un conjunto de sentencias case.
 * Cada case es una posible respuesta a la evaluacion de esa condicion.
 */

public static void main(String[] args) {
    
int dia = 1;
String nombreDia;

switch (dia) {

    case 1: nombreDia = "Lunes";
    break;
    case 2: nombreDia = "Martes";
    break;
    case 3: nombreDia = "Miercoles";
    break;
    case 4: nombreDia = "Jueves";
    break;
    case 5: nombreDia = "Viernes";
    break;
    case 6: nombreDia = "Sabado";
    break;
    case 7: nombreDia = "Domingo";
    break;
    default: nombreDia = " numero de dia invalido";
    break;

    }

System.out.println("el dia de la semana seleccionado es: " + nombreDia);

}
    
}

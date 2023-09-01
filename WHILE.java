
/* Estructuras repetitivas con WHILE 
 * Permite ejecutar una cierta porcion de codigo  por una determinada cantidad de veces.
 * Esta ejecucion repetitiva se conoce como un bucle.
 * Es la mas conocida y utilizada en java.
 * La condicion se evalua siempre al inicidio del ciclo/bucle.
 * 
 * Ejemplo bucle controlado por contador. 
*/


public class WHILE {

    public static void main(String[] args) {
        
        int contador=0;

        while (contador <= 10) {
            System.out.println("Estoy en la vuelta " + contador);
            contador = contador + 1;
        }
    }  
}

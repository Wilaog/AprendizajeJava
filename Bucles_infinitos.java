
/*un bucle infinito se produce cuando por algun motivo el programa entra en un bucle 
pero el mismo no tiene una condicion de salida

Ejemplo bucle controlado por centinela*/

public class Bucles_infinitos {

    public static void main(String[] args) {
        
        boolean centinela = true;

        while (centinela == true) {
            System.out.println("El valor de la bandera es " + centinela);

            centinela = false;
        }
    }
    
}

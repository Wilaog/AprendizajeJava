import java.util.Scanner;

public class EjercicioCentinela {

    public static void main(String[] args) {

        //Sabemos que es un bucle
        //Sabemos la condicion de salida
        //Que estructura usar? --> El FOR queda excluido por ser controlado solo por contador

        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner (System.in);
        String palabra  = teclado.next();

        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es : " + palabra);

            System.out.println("Ingrese una palabra");
            palabra = teclado.next();
        }

    }       
    
}

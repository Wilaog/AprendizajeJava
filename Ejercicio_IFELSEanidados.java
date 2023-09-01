public class Ejercicio_IFELSEanidados {
    
// Condicionales multiples if+  else + if + else
// Se utiliza cuando se necesita anidar varias condiciones if si no se ci,ple la primera.
// Varias condiciones en un mismo problema o algoritmo.

public static void main(String[] args) {
    
    int num1 = 10;
    int num2 = 12;

    if ( num2 > num1 ) {
        System.out.println( " El num2 es mayor al num1");
    }
    else {
        if (num1 == num2) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("El num1 es mayor al num2");
        }
  
       
        // System.out.println("El num1 es mayor al num2");

}
}
}

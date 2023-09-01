
public class Arbolito_Navidad {
    public static void main(String[] args) {
        
// Altura del arbol
int altura = 10;

// Bucle para recorrer todas las filas(altura)
for (int fila=0; fila<altura; fila++) {

// Bucle para los espacios
     for (int espacio=0; espacio<(altura-fila-1); espacio++) {
        System.out.print(" ");
     }

// Bucle para los asteriscos
     for ( int asterisco=0; asterisco<(fila*2)+1; asterisco++) {
        System.out.print("*");
      }  
      System.out.println("");
    }
    //Tronco
    int largoTronco = 3;
    for (int base=0; base<largoTronco; base++) {
    //Espacios en blanco
    for (int espacio=0; espacio<(altura-2); espacio++) {
        System.out.print(" ");
    }

    //Barritas tronco
    for (int tronco=0; tronco<3; tronco++) {
        System.out.print("|");
    }
System.out.println("");
}
}
}



/* Llevar a cabo un programa que incluya un vector que almacene los nombre: 
Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
Realizar un recorrido del vector para cargar los datos y otro recorrido para 
mostrar los mismos por pantalla.
Son 8 nombres
 */

public class EjercicioArrays3 {

    public static void main(String[] args) {

        String vector[] = new String[8];

        // Asignacion manual de los valores
        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Rosa";
        vector[3] = "Guillermo";
        vector[4] = "Gabriel";
        vector[5] = "Daniel";
        vector[6] = "Luisa";
        vector[7] = "Ludmila";

        //Recorrido
        for (int i=0; i<vector.length; i++) {
            System.out.println("En la posicion " + i + " está el nombre: " + vector[i] );
        }

    }
    
}

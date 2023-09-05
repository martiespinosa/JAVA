// ARRAY = MATRIZ = ARREGLO

public class Array1 {
    public static void main(String[] args) {
        
        // declarción e iniciación en diferentes líneas
        /* int [] mi_array = new int [5];
        mi_array[0] = 15;
        mi_array[1] = 25;
        mi_array[2] = 8;
        mi_array[3] = -7;
        mi_array[4] = 92; */

        // declarción e iniciación en la misma línea
        int mi_array [] = {15, 25, 8, -7, 92};


        // imprimir tosos los elementos de la matriz con un bucle for
        for (int i = 0; i < mi_array.length; i++) {
            System.out.println(mi_array[i]);
        }
        
    }    
}
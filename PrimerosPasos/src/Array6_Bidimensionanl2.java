// ARRAY BIDIMENSIONAL (ARRAY DENTRO DE ARRAY) DECLARADA E INICIADA JUNTO (y bocles for each anidados)

public class Array6_Bidimensionanl2 {
    public static void main(String[] args) {
        
        int [][] matrix = {
            {10, 15, 8, 19, 21},
            {5, 25, 37, 41, 15},
            {7, 19, 32, 14, 90},
            {85, 2, 71, 40, 27}
        };

        

        for (int [] fila: matrix) {
            System.out.println();
            for (int z: fila) {
                System.out.print(z + " ");
            }
        }

    }
}

// CALCULADOR DE FACTORIALES (HASTA EL NUMEERO 25)

import javax.swing.JOptionPane;

public class BucleFor3 {
    public static void main(String[] args) {
        
        Long resultado = 1L;

        int numero_factorial = Integer.parseInt(JOptionPane.showInputDialog("Intoduce un número"));

        for (int i = numero_factorial; i>0; i--) {
            resultado = resultado * i;
        }   
        System.out.println("El factorial de " + numero_factorial + " es " + resultado);

    }
}

import javax.swing.*;
// Usaremos la clase JOptionPane, método showInputDialog

public class EntradaSalidaDatos2 {
    public static void main(String[] args) throws Exception {

    // String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
    // String edad = JOptionPane.showInputDialog("Introduce tu edad");
    // int edad_usuario = Integer.parseInt(edad);
    // System.out.println("Hola " + nombre_usuario + ". El agno que viene tendras " + (edad_usuario+1) + " agnos.");
    
    String num1 = JOptionPane.showInputDialog("Introduce un numero");
    double num1_1 = Double.parseDouble(num1); // convertir string a double
    System.out.print("La raiz de " + num1_1 + " es ");
    System.out.printf("%1.2f", Math.sqrt(num1_1)); // redondear a 2 decimales
    
    }
}

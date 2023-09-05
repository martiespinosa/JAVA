// ARRAY CON LOS VALORES ENTRADOS DESDE JOPTIONPANE

import javax.swing.JOptionPane;

public class Array3_JOP {
    public static void main(String[] args) {
        
        String [] paises = new String [8];

        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
        }

        for (String i: paises) {
            System.out.println(i);
        }

    }
}

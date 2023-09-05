// VALIDADOR SIMPLE DE EMAIL

import javax.swing.JOptionPane;

public class BucleFor2 {
    public static void main(String[] args) {
        
        int arroba = 0;
        boolean punto = false;
        
        String mail = JOptionPane.showInputDialog("Introduce tu correo electrónico");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba ++;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }

        if (arroba == 1 && punto == true) {
            System.out.println("Email correcto");
        } else {
            System.out.println("Email incorrecto");
        }

    }
}

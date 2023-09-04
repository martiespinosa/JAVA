// VALIDADOR DE EMAIL

import javax.swing.JOptionPane;

public class BucleFor2 {
    public static void main(String[] args) {
        
        boolean arroba = false;
        
        String mail = JOptionPane.showInputDialog("Introduce tu correo electrónico");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
            }
        }

        if (arroba == true) {
            System.out.println("Email correcto");
        } else {
            System.out.println("Email incorrecto");
        }

    }
}

import javax.swing.JOptionPane;

public class BucleWhile1 {
    public static void main(String[] args) {
        
        String password = "marti";
        String entrada_usuario = "";
        
        while (password.equals(entrada_usuario) == false) { // password != entrada_usuario
            entrada_usuario = JOptionPane.showInputDialog("Introduce la contraseña");
            if (password.equals(entrada_usuario) == false) {
                System.out.println("Contraseña incorrecta, vuelve a intentarlo");
            } else {
                System.out.println("Contraseña correcta, estás dentro");
            }
        }

    }
}
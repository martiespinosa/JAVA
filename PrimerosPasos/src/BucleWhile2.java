import java.util.Scanner;

public class BucleWhile2 {
    public static void main(String[] args) {
    
        int num_aleatorio = (int)(Math.random() * 100);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Acierta el número aleatorio entre 0 y 100");
        int num_usuario = entrada.nextInt();

        int intentos = 1;

        while (num_aleatorio != num_usuario) {
            intentos ++;
            if (num_aleatorio < num_usuario) {
                System.out.println("¡Más pequeño!");
                num_usuario = entrada.nextInt();
            }
            else if (num_aleatorio > num_usuario) {
                System.out.println("¡Más grande!");
                num_usuario = entrada.nextInt();
            }
        }
        System.out.println("¡HAS AERTADO EL NÚMERO ALEATORIO CON " + intentos + " INTENTOS!");       
        entrada.close();
    }
}

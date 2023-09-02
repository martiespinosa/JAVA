import java.util.*;

// si un metodo es estatico hay que hacer referencia a la clase que pertenece el metodo (ej. Math.sqrt). si el metodo no es estatico hay que crar antes un objeto perteneciente a esa clase (ej. Scanner entrada = new Scanner(System.in) donde entrada es un objeto perteneciente a la clase Scanner, ahora ya se pueden usar metodos de la clase Scanner así (ej. entrada.nextLine()))

public class EntradaSalidaDatos1 {
    // ejecutar el programa desde "Run" de aqui abajo para que funcione
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in); // el metodo Scanner es el constructor de la clase Scanner. (en todas las clases el constructor se llama igual que la propia clase)
        
        System.out.println("Introduce tu nombre: ");
        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad_usuario = entrada.nextInt();
        
        entrada.close();

        System.out.println("Hola " + nombre_usuario + ". Tienes " + edad_usuario + " años.");

    }
}

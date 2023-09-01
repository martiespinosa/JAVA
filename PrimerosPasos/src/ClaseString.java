public class ClaseString {
    public static void main(String[] args) throws Exception {

        String mi_nombre = "Marti"; // donde "mi_nombre" es un objeto (instancia, ejemplar) de la clase String
        System.out.println("Mi nombre es: " + mi_nombre);
        System.out.println("Mi nombre tiene: " + mi_nombre.length() + " caracteres"); // LENGTH
        System.out.println("La primera letra de mi nombre es: " + mi_nombre.charAt(0)); // charAt
        int ultima_letra = mi_nombre.length();
        System.out.println("Y la última letra de mi nombre es: " + mi_nombre.charAt(ultima_letra - 1));

        // SUBSTRING
        String frase = "\nHoy es un buen día para aprender Java";
        System.out.println(frase);
        String frase_resumen = frase.substring(25, 37) + " con Juan\n";
        System.out.println(frase_resumen);

        // EQUALS
        String alumno1, alumno2, alumno3;
        alumno1 = "Pedro";
        alumno2 = "Pedro";
        alumno3 = "pedro";
        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equals(alumno3) + "\n");
        
        // EQUALS IGNORE CASE
        String empleado1, empleado2, empleado3;
        empleado1 = "Fabio";
        empleado2 = "Fabio";
        empleado3 = "fabio";
        System.out.println(empleado1.equalsIgnoreCase(empleado2));
        System.out.println(empleado1.equalsIgnoreCase(empleado3));
        
    }
}

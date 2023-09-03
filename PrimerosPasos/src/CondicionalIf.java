// Condicional If para evaluar si una edad es mayor de edad o no 

import java.util.*;

public class CondicionalIf {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();
        entrada.close();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");          
        } 
        else {
            System.out.println("Eres menor de edad");
        }



    }
}
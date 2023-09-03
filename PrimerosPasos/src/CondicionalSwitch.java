import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nCALCULADORA DE AREAS\n\nElije una opción:\n1: Cuadrado\n2: Rectángulo\n3: Triángulo\n4: Círculo");
        int figura = entrada.nextInt();
        
        switch (figura) {                      
            case 1:
                System.out.println("Lado del cuadrado:");
                double lado = entrada.nextDouble();
                double area = Math.pow(lado, 2);
                System.out.print("La area del cuadrado de lado = " + lado + " es: ");
                System.out.printf("%1.2f", area);
                break;

            case 2:
                System.out.println("Base del rectangulo:");
                double base = entrada.nextDouble();
                System.out.println("Altura del rectangulo:");
                double altura = entrada.nextDouble();
                area = base * altura;
                System.out.print("La area del rectangulo de base = " + base + " y altura = " + altura + " es: ");
                System.out.printf("%1.2f", area);
                break;

            case 3:
                System.out.println("Base del triangulo:");
                base = entrada.nextDouble();
                System.out.println("Altura del triangulo:");
                altura = entrada.nextDouble();
                area = (base * altura) / 2;
                System.out.print("La area del triangulo de base = " + base + " y altura = " + altura + " es: ");
                System.out.printf("%1.2f", area);
                break;

            case 4:
                System.out.println("Radio del circulo:");
                double radio = entrada.nextDouble();
                area = Math.PI * (Math.pow(radio, 2));
                System.out.print("La area del circulo de radio = " + radio + " es: ");
                System.out.printf("%1.2f", area); 
                break;
                
            default:
                System.out.println("La opción no es correcta");
        }
        entrada.close();
    }
}
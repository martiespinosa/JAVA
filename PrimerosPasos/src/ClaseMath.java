// https://docs.oracle.com/javase/8/docs/api/ (API JAVA) (biblioteca de clases predefinidas de java)

public class ClaseMath {
    public static void main(String[] args) throws Exception {
        
        // sqrt (raíz cuadrada)
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        
        // round (redeondeo)(de float a int y de double a long)
        float num1 = 5.85f;
        int resultado1 = Math.round(num1);
        System.out.println(resultado1);

        double num2 = 5.858585;
        long resultado2 = Math.round(num2);
        System.out.println(resultado2);

            // refundición (convertir un tipo de dato a otro) (en este caso de long a int) (int)
            int resultado3 = (int)Math.round(num2);
            System.out.println(resultado3);
        

        // pow (elevar a n)
        double base = 5;
        double exponente = 3;
        int resultado4 = (int)Math.pow(base, exponente);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es igual a " + resultado4);
        
    }
}

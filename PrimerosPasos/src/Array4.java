// ARRAY CON VALORES REANDOM

public class Array4 {
    public static void main(String[] args) {
        
        int [] array_random = new int[150];

        for (int i = 0; i < array_random.length; i++) {
            array_random[i] = (int) Math.round(Math.random() * 100);
        }

        for (int i: array_random) {
            System.out.print(i + " ");
        }
        
    }
}

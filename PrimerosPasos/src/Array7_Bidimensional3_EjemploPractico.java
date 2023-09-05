// EJEMPLO PRACTICO DE ARRAY 2D CON INICIACIÓN AUTOMÁTICO (CON BUCLE FOR) SOBRE CAPITAL E INTERÉS

import javax.swing.JOptionPane;

public class Array7_Bidimensional3_EjemploPractico {
    public static void main(String[] args) {
        
        double capital=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital "));
		int periodos=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de años a calcular"));
		int interes_menor=Integer.parseInt(JOptionPane.showInputDialog("ingrese el interes inferior"));
		double i_menor=(double)interes_menor/100;
		int interes_mayor=Integer.parseInt(JOptionPane.showInputDialog("ingrese el interes superior"));
		// double i_mayor=(double)interes_mayor/100;
		int a=periodos+1;
		double acumulado;
		int b=(interes_mayor-interes_menor)+1;
		double saldo[][]=new double[a][b];
		double interes=i_menor;
		for(int j=0;j<b;j++) {
			saldo[0][j]=capital;
			acumulado=capital;
			
			for(int i=1;i<a;i++) {
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
			}
			interes=interes+0.01;
		}
		// ----------- imprimir ------------
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.printf("%1.2f",saldo[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author leydi
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso16 {

    /**
     *
     * @param args
     */
    public static void  main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese horas trabajadas: ");
		float horas = sc.nextFloat();
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float r = (float) (horas * tarifa);
	        float x = (float) (r * (0.05));
		float a = (float) (x + r);
                float p =  (float) (a / 3.24);
		
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("sueldo: "+ r);
		System.out.println("bono: "+ x);
		System.out.println("Total: "+  a);
                System.out.println("Total en dolares: " + p);
    }  
}

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
    
public class Caso15 {

    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese Cantidad: ");
		float cantidad = sc.nextFloat();
		System.out.print("Ingrese Precio: ");
		float x = sc.nextFloat();
		
		float importe = cantidad * x;
	        double dolares = (float)(cantidad * x)/3.24;
		double euros = (float)(cantidad * x)/3.75;
		
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Importe: "+ (float)importe);
		System.out.println("En dolares: "+ (float)+dolares);
		System.out.println("En euros: "+  (float) +euros);

	



    }
    
}

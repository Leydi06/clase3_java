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
public class caso20 {
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese el valor de una venta: ");
		int venta = sc.nextInt();
                
                float valor = (float) (venta + venta * 0.42);
		
		
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println( "Cual es el valor aumentado en 42%: "+ valor);
    
    }   
}


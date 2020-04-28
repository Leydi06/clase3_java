/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leydi
 */
import java.util.Scanner;
public class caso23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
		String  x = sc.nextLine();
                System.out.print("Precio: ");
                int a = sc.nextInt();
                System.out.print("Cantidad: ");
                int b = sc.nextInt();
                
                float r1 = (float) a * b;
                float r2 = (float) ((float) r1 *(0.18));
                float r3 = (float) ((float)r1 * (0.03));
                float r4 = (float) r1 - r3 + r2;
                
                
                System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println( "Nombre del producto: " + x );
                System.out.println("Importe: "+ r1);
                System.out.println("IGV: "+ r2);
                System.out.println("DESCUENTO DEL 3% del importe: "+ r3);
                System.out.println("Total: "+ r4);
    

    }
    
}

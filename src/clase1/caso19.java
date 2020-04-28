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
public class caso19 {
    
		public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese numero del lado1: ");
		int l1 = sc.nextInt();
		System.out.print("Ingrese numero del lado2: ");
		int l2 = sc.nextInt();
                System.out.print("Ingrese el numero del lado3: ");
		int l3 = sc.nextInt();
		int p = (int)(l1 + l2 + l3);
		
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println( "area del triangulo: "+ p);
    }   
}

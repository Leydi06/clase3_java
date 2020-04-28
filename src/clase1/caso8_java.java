/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author leydi
 */
public class caso8_java {
     public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
                int lado = 0;
		
		System.out.print("Ingrese lado: ");
		lado = sc.nextInt();
                
                System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Area del cuadrado: "+ lado * lado );
		System.out.println("Perimetro: "+ lado *4);
		
     }
}

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
public class caso11_java {
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                
                System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ "); 
                System.out.println("Numero de caracteres : "+ nombre.length());
    }
}

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
public class caso18 {
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese numero de la base: ");
		int base = sc.nextInt();
		System.out.print("Ingrese numero de la altura: ");
		int altura = sc.nextInt();
		
		float r1 = (float)(base * altura) / 2;
		
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Area del triangulo: " + r1);
    }   
}

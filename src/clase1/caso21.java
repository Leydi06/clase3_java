
import java.util.Scanner;

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
public class caso21 {
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese el valor de un gasto: ");
		int gasto = sc.nextInt();
                
                float valor = (float) (gasto - gasto * 0.12);
		
		
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println( "Cual es el valor disminuido en 12%: "+ valor);
    
    }  
}

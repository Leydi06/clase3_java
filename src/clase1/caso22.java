
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
public class caso22 {
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nombre del alumno: ");
		String  x = sc.nextLine();
                System.out.print("Nota 1 : ");
                int a = sc.nextInt();
                System.out.print("Nota 2: ");
                int b = sc.nextInt();
                System.out.print("Nota 3: ");
                int c = sc.nextInt();
                
                
                float f = (int)( a + b + c)/3;
                float g = (float) ((float)a + a *( 0.20));
                float t = (float) ((float)b + b * 0.30);
                float p = (float) ((float)c + c *0.50);
                
                System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println( "Nombre del alumno: " + x );
                System.out.println("Promedio: "+ f);
                System.out.println("Nota 1 aumentado en 20%: "+ g);
                System.out.println("Nota 2 aumentado en 30%: "+ t);
                System.out.println("Nota 3 aumentado en 40%: "+ p);
    }
    
}

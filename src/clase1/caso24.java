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
public class caso24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("Monto 1: ");
		int x = sc.nextInt();
                System.out.print("Monto 2: ");
                int a = sc.nextInt();
                System.out.print("Monto 3: ");
                int b = sc.nextInt();
                
                float r1 = (float) x / 5;
                float r2 = (float) ((float) a + a *(0.20));
                float r3 = (float) ((float)b / 2 * (0.60));
                float r4 = (float) r1 + r2 + r3;
                float r5 = (float) ((float)r4 - r4 *(0.8));
    
                System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
                System.out.println("Primer monto: "+ r1);
                System.out.println("Segundo monto: "+ r2);
                System.out.println("Tercer monto: "+ r3);
                System.out.println("Suma Total: "+ r5);
    }   
}

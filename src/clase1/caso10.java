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
public class caso10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Radio: ");
        int radio = sc.nextInt();
        
        float r1 = (float) ((float)(radio * radio)* 3.1416); 
        float r2 = (float) (2 *3.1416) * radio;
       
        System.out.println("-------------------");
        System.out.println("RESULTADOS");
        System.out.println("-------------------");
        System.out.println("Area del circulo: "+ r1);
        System.out.println("Perimetro: "+r2);
    }
    
}

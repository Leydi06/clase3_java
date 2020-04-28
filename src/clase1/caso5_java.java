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
public class caso5_java {
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
                
                float n1 = 0, n2 = 0;
                System.out.print("Ingrese primer numero: ");
		n1 =sc.nextFloat();
		System.out.print("Ingrese segundo numero: ");
		n2 =sc.nextFloat();
                
                float promedio , aumento , disminuido;
                promedio = (n1 + n2)/2;
                aumento = (float)(n1 *1.2);
                disminuido = (float)(n2 * 0.7);
                System.out.println("--------RESULTADOS----");
                System.out.println("promedio: "+promedio);
                System.out.println("Primer numero aumentado en 20%: "+aumento);
                System.out.println("Segundo numero disminuido en 30%: "+ disminuido);
    }  
}
